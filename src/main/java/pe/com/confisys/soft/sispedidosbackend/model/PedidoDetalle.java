/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_pedido_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoDetalle.findAll", query = "SELECT p FROM PedidoDetalle p")
    , @NamedQuery(name = "PedidoDetalle.findByTbPedidoDetalleId", query = "SELECT p FROM PedidoDetalle p WHERE p.tbPedidoDetalleId = :tbPedidoDetalleId")
    , @NamedQuery(name = "PedidoDetalle.findByPrecioUnidadFinal", query = "SELECT p FROM PedidoDetalle p WHERE p.precioUnidadFinal = :precioUnidadFinal")
    , @NamedQuery(name = "PedidoDetalle.findByCantidad", query = "SELECT p FROM PedidoDetalle p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "PedidoDetalle.findByActivo", query = "SELECT p FROM PedidoDetalle p WHERE p.activo = :activo")
    , @NamedQuery(name = "PedidoDetalle.findByUsuReg", query = "SELECT p FROM PedidoDetalle p WHERE p.usuReg = :usuReg")
    , @NamedQuery(name = "PedidoDetalle.findByFecReg", query = "SELECT p FROM PedidoDetalle p WHERE p.fecReg = :fecReg")
    , @NamedQuery(name = "PedidoDetalle.findByUsuModif", query = "SELECT p FROM PedidoDetalle p WHERE p.usuModif = :usuModif")
    , @NamedQuery(name = "PedidoDetalle.findByFecModif", query = "SELECT p FROM PedidoDetalle p WHERE p.fecModif = :fecModif")})
public class PedidoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_pedido_detalle_id")
    private Integer tbPedidoDetalleId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_unidad_final")
    private Float precioUnidadFinal;
    @Column(name = "cantidad")
    private Float cantidad;
    @Lob
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "activo")
    private Integer activo;
    @Column(name = "usu_reg")
    private String usuReg;
    @Column(name = "fec_reg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecReg;
    @Column(name = "usu_modif")
    private String usuModif;
    @Column(name = "fec_modif")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModif;
    @JoinColumn(name = "tb_pedido_id", referencedColumnName = "tb_pedido_id")
    @ManyToOne(optional = false)
    private Pedido tbPedidoId;
    @JoinColumn(name = "tb_producto_id", referencedColumnName = "tb_producto_id")
    @ManyToOne(optional = false)
    private Producto tbProductoId;

    public PedidoDetalle() {
    }

    public PedidoDetalle(Integer tbPedidoDetalleId) {
        this.tbPedidoDetalleId = tbPedidoDetalleId;
    }

    public Integer getTbPedidoDetalleId() {
        return tbPedidoDetalleId;
    }

    public void setTbPedidoDetalleId(Integer tbPedidoDetalleId) {
        this.tbPedidoDetalleId = tbPedidoDetalleId;
    }

    public Float getPrecioUnidadFinal() {
        return precioUnidadFinal;
    }

    public void setPrecioUnidadFinal(Float precioUnidadFinal) {
        this.precioUnidadFinal = precioUnidadFinal;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(String usuReg) {
        this.usuReg = usuReg;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getUsuModif() {
        return usuModif;
    }

    public void setUsuModif(String usuModif) {
        this.usuModif = usuModif;
    }

    public Date getFecModif() {
        return fecModif;
    }

    public void setFecModif(Date fecModif) {
        this.fecModif = fecModif;
    }

    public Pedido getTbPedidoId() {
        return tbPedidoId;
    }

    public void setTbPedidoId(Pedido tbPedidoId) {
        this.tbPedidoId = tbPedidoId;
    }

    public Producto getTbProductoId() {
        return tbProductoId;
    }

    public void setTbProductoId(Producto tbProductoId) {
        this.tbProductoId = tbProductoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbPedidoDetalleId != null ? tbPedidoDetalleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDetalle)) {
            return false;
        }
        PedidoDetalle other = (PedidoDetalle) object;
        if ((this.tbPedidoDetalleId == null && other.tbPedidoDetalleId != null) || (this.tbPedidoDetalleId != null && !this.tbPedidoDetalleId.equals(other.tbPedidoDetalleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.PedidoDetalle[ tbPedidoDetalleId=" + tbPedidoDetalleId + " ]";
    }
    
}
