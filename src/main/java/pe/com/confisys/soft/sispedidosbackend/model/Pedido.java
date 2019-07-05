/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByTbPedidoId", query = "SELECT p FROM Pedido p WHERE p.tbPedidoId = :tbPedidoId")
    , @NamedQuery(name = "Pedido.findByCodEstadoPedido", query = "SELECT p FROM Pedido p WHERE p.codEstadoPedido = :codEstadoPedido")
    , @NamedQuery(name = "Pedido.findByFechaTentativaEntrega", query = "SELECT p FROM Pedido p WHERE p.fechaTentativaEntrega = :fechaTentativaEntrega")
    , @NamedQuery(name = "Pedido.findByFechaEntrega", query = "SELECT p FROM Pedido p WHERE p.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Pedido.findByMontoBase", query = "SELECT p FROM Pedido p WHERE p.montoBase = :montoBase")
    , @NamedQuery(name = "Pedido.findByMontoFinal", query = "SELECT p FROM Pedido p WHERE p.montoFinal = :montoFinal")
    , @NamedQuery(name = "Pedido.findByUsuEntrega", query = "SELECT p FROM Pedido p WHERE p.usuEntrega = :usuEntrega")
    , @NamedQuery(name = "Pedido.findByOrigenRegistro", query = "SELECT p FROM Pedido p WHERE p.origenRegistro = :origenRegistro")
    , @NamedQuery(name = "Pedido.findByActivo", query = "SELECT p FROM Pedido p WHERE p.activo = :activo")
    , @NamedQuery(name = "Pedido.findByUsuReg", query = "SELECT p FROM Pedido p WHERE p.usuReg = :usuReg")
    , @NamedQuery(name = "Pedido.findByFecReg", query = "SELECT p FROM Pedido p WHERE p.fecReg = :fecReg")
    , @NamedQuery(name = "Pedido.findByUsuModif", query = "SELECT p FROM Pedido p WHERE p.usuModif = :usuModif")
    , @NamedQuery(name = "Pedido.findByFecModif", query = "SELECT p FROM Pedido p WHERE p.fecModif = :fecModif")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_pedido_id")
    private Integer tbPedidoId;
    @Column(name = "cod_estado_pedido")
    private String codEstadoPedido;
    @Column(name = "fecha_tentativa_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaTentativaEntrega;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "monto_base")
    private String montoBase;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_final")
    private Double montoFinal;
    @Column(name = "usu_entrega")
    private String usuEntrega;
    @Basic(optional = false)
    @Column(name = "origen_registro")
    private int origenRegistro;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPedidoId")
    private List<PedidoDetalle> pedidoDetalleList;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne(optional = false)
    private Cliente tbClienteId;
    @JoinColumn(name = "tb_direccion_id", referencedColumnName = "tb_direccion_id")
    @ManyToOne(optional = false)
    private Direccion tbDireccionId;

    public Pedido() {
    }

    public Pedido(Integer tbPedidoId) {
        this.tbPedidoId = tbPedidoId;
    }

    public Pedido(Integer tbPedidoId, int origenRegistro) {
        this.tbPedidoId = tbPedidoId;
        this.origenRegistro = origenRegistro;
    }

    public Integer getTbPedidoId() {
        return tbPedidoId;
    }

    public void setTbPedidoId(Integer tbPedidoId) {
        this.tbPedidoId = tbPedidoId;
    }

    public String getCodEstadoPedido() {
        return codEstadoPedido;
    }

    public void setCodEstadoPedido(String codEstadoPedido) {
        this.codEstadoPedido = codEstadoPedido;
    }

    public Date getFechaTentativaEntrega() {
        return fechaTentativaEntrega;
    }

    public void setFechaTentativaEntrega(Date fechaTentativaEntrega) {
        this.fechaTentativaEntrega = fechaTentativaEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(String montoBase) {
        this.montoBase = montoBase;
    }

    public Double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getUsuEntrega() {
        return usuEntrega;
    }

    public void setUsuEntrega(String usuEntrega) {
        this.usuEntrega = usuEntrega;
    }

    public int getOrigenRegistro() {
        return origenRegistro;
    }

    public void setOrigenRegistro(int origenRegistro) {
        this.origenRegistro = origenRegistro;
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

    @XmlTransient
    public List<PedidoDetalle> getPedidoDetalleList() {
        return pedidoDetalleList;
    }

    public void setPedidoDetalleList(List<PedidoDetalle> pedidoDetalleList) {
        this.pedidoDetalleList = pedidoDetalleList;
    }

    public Cliente getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(Cliente tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public Direccion getTbDireccionId() {
        return tbDireccionId;
    }

    public void setTbDireccionId(Direccion tbDireccionId) {
        this.tbDireccionId = tbDireccionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbPedidoId != null ? tbPedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.tbPedidoId == null && other.tbPedidoId != null) || (this.tbPedidoId != null && !this.tbPedidoId.equals(other.tbPedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Pedido[ tbPedidoId=" + tbPedidoId + " ]";
    }
    
}
