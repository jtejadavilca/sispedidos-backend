/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_pedido_detalle")
@AttributeOverride(name="id", column=@Column(name="tb_pedido_detalle_id"))
@XmlRootElement
@JsonRootName("pedidoDetalle")
//@NamedQueries({
//    @NamedQuery(name = "PedidoDetalleEntity.findAll", query = "SELECT p FROM PedidoDetalleEntity p")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByTbPedidoDetalleId", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.tbPedidoDetalleId = :tbPedidoDetalleId")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByPrecioUnidadFinal", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.precioUnidadFinal = :precioUnidadFinal")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByCantidad", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.cantidad = :cantidad")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByActivo", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.activo = :activo")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByUsuReg", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.usuReg = :usuReg")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByFecReg", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.fecReg = :fecReg")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByUsuModif", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.usuModif = :usuModif")
//    , @NamedQuery(name = "PedidoDetalleEntity.findByFecModif", query = "SELECT p FROM PedidoDetalleEntity p WHERE p.fecModif = :fecModif")})
public class PedidoDetalleEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_pedido_detalle_id")
//    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_unidad_final")
    private Float precioUnidadFinal;
    @Column(name = "cantidad")
    private Float cantidad;
    @Lob
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "tb_pedido_id", referencedColumnName = "tb_pedido_id")
    @ManyToOne(optional = false)
    private PedidoEntity tbPedidoId;
    @JoinColumn(name = "tb_producto_id", referencedColumnName = "tb_producto_id")
    @ManyToOne(optional = false)
    private ProductoEntity tbProductoId;

    public PedidoDetalleEntity() {
    }

    public PedidoDetalleEntity(Integer tbPedidoDetalleId) {
        this.id = tbPedidoDetalleId;
    }

    public Integer getTbPedidoDetalleId() {
        return id;
    }

    public void setTbPedidoDetalleId(Integer tbPedidoDetalleId) {
        this.id = tbPedidoDetalleId;
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

    public PedidoEntity getTbPedidoId() {
        return tbPedidoId;
    }

    public void setTbPedidoId(PedidoEntity tbPedidoId) {
        this.tbPedidoId = tbPedidoId;
    }

    public ProductoEntity getTbProductoId() {
        return tbProductoId;
    }

    public void setTbProductoId(ProductoEntity tbProductoId) {
        this.tbProductoId = tbProductoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDetalleEntity)) {
            return false;
        }
        PedidoDetalleEntity other = (PedidoDetalleEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.PedidoDetalleEntity[ tbPedidoDetalleId=" + id + " ]";
    }
    
}
