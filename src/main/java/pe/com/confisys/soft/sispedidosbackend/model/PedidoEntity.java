/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_pedido")
@AttributeOverride(name="id", column=@Column(name="tb_pedido_id"))
@XmlRootElement
@JsonRootName("pedido")
//@NamedQueries({
//    @NamedQuery(name = "PedidoEntity.findAll", query = "SELECT p FROM PedidoEntity p")
//    , @NamedQuery(name = "PedidoEntity.findByTbPedidoId", query = "SELECT p FROM PedidoEntity p WHERE p.tbPedidoId = :tbPedidoId")
//    , @NamedQuery(name = "PedidoEntity.findByCodEstadoPedido", query = "SELECT p FROM PedidoEntity p WHERE p.codEstadoPedido = :codEstadoPedido")
//    , @NamedQuery(name = "PedidoEntity.findByFechaTentativaEntrega", query = "SELECT p FROM PedidoEntity p WHERE p.fechaTentativaEntrega = :fechaTentativaEntrega")
//    , @NamedQuery(name = "PedidoEntity.findByFechaEntrega", query = "SELECT p FROM PedidoEntity p WHERE p.fechaEntrega = :fechaEntrega")
//    , @NamedQuery(name = "PedidoEntity.findByMontoBase", query = "SELECT p FROM PedidoEntity p WHERE p.montoBase = :montoBase")
//    , @NamedQuery(name = "PedidoEntity.findByMontoFinal", query = "SELECT p FROM PedidoEntity p WHERE p.montoFinal = :montoFinal")
//    , @NamedQuery(name = "PedidoEntity.findByUsuEntrega", query = "SELECT p FROM PedidoEntity p WHERE p.usuEntrega = :usuEntrega")
//    , @NamedQuery(name = "PedidoEntity.findByOrigenRegistro", query = "SELECT p FROM PedidoEntity p WHERE p.origenRegistro = :origenRegistro")
//    , @NamedQuery(name = "PedidoEntity.findByActivo", query = "SELECT p FROM PedidoEntity p WHERE p.activo = :activo")
//    , @NamedQuery(name = "PedidoEntity.findByUsuReg", query = "SELECT p FROM PedidoEntity p WHERE p.usuReg = :usuReg")
//    , @NamedQuery(name = "PedidoEntity.findByFecReg", query = "SELECT p FROM PedidoEntity p WHERE p.fecReg = :fecReg")
//    , @NamedQuery(name = "PedidoEntity.findByUsuModif", query = "SELECT p FROM PedidoEntity p WHERE p.usuModif = :usuModif")
//    , @NamedQuery(name = "PedidoEntity.findByFecModif", query = "SELECT p FROM PedidoEntity p WHERE p.fecModif = :fecModif")})
public class PedidoEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_pedido_id")
//    private Integer id;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbPedidoId")
    private List<PedidoDetalleEntity> pedidoDetalleEntityList;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne(optional = false)
    private ClienteEntity tbClienteId;
    @JoinColumn(name = "tb_direccion_id", referencedColumnName = "tb_direccion_id")
    @ManyToOne(optional = false)
    private DireccionEntity tbDireccionId;

    public PedidoEntity() {
    }

    public PedidoEntity(Integer tbPedidoId) {
        this.id = tbPedidoId;
    }

    public PedidoEntity(Integer tbPedidoId, int origenRegistro) {
        this.id = tbPedidoId;
        this.origenRegistro = origenRegistro;
    }

    public Integer getTbPedidoId() {
        return id;
    }

    public void setTbPedidoId(Integer tbPedidoId) {
        this.id = tbPedidoId;
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

    @XmlTransient
    public List<PedidoDetalleEntity> getPedidoDetalleEntityList() {
        return pedidoDetalleEntityList;
    }

    public void setPedidoDetalleEntityList(List<PedidoDetalleEntity> pedidoDetalleEntityList) {
        this.pedidoDetalleEntityList = pedidoDetalleEntityList;
    }

    public ClienteEntity getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(ClienteEntity tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public DireccionEntity getTbDireccionId() {
        return tbDireccionId;
    }

    public void setTbDireccionId(DireccionEntity tbDireccionId) {
        this.tbDireccionId = tbDireccionId;
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
        if (!(object instanceof PedidoEntity)) {
            return false;
        }
        PedidoEntity other = (PedidoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.PedidoEntity[ tbPedidoId=" + id + " ]";
    }
    
}
