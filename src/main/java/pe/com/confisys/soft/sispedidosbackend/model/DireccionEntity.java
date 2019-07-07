/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_direccion")
@AttributeOverride(name="id", column=@Column(name="tb_direccion_id"))
@XmlRootElement
@JsonRootName("direccion")
//@NamedQueries({
//    @NamedQuery(name = "DireccionEntity.findAll", query = "SELECT d FROM DireccionEntity d")
//    , @NamedQuery(name = "DireccionEntity.findByTbDireccionId", query = "SELECT d FROM DireccionEntity d WHERE d.tbDireccionId = :tbDireccionId")
//    , @NamedQuery(name = "DireccionEntity.findByUrbanizacion", query = "SELECT d FROM DireccionEntity d WHERE d.urbanizacion = :urbanizacion")
//    , @NamedQuery(name = "DireccionEntity.findByAvenida", query = "SELECT d FROM DireccionEntity d WHERE d.avenida = :avenida")
//    , @NamedQuery(name = "DireccionEntity.findByJiron", query = "SELECT d FROM DireccionEntity d WHERE d.jiron = :jiron")
//    , @NamedQuery(name = "DireccionEntity.findByCalle", query = "SELECT d FROM DireccionEntity d WHERE d.calle = :calle")
//    , @NamedQuery(name = "DireccionEntity.findByManzana", query = "SELECT d FROM DireccionEntity d WHERE d.manzana = :manzana")
//    , @NamedQuery(name = "DireccionEntity.findByLote", query = "SELECT d FROM DireccionEntity d WHERE d.lote = :lote")
//    , @NamedQuery(name = "DireccionEntity.findByNumero", query = "SELECT d FROM DireccionEntity d WHERE d.numero = :numero")
//    , @NamedQuery(name = "DireccionEntity.findByLetra", query = "SELECT d FROM DireccionEntity d WHERE d.letra = :letra")
//    , @NamedQuery(name = "DireccionEntity.findByPiso", query = "SELECT d FROM DireccionEntity d WHERE d.piso = :piso")
//    , @NamedQuery(name = "DireccionEntity.findByBloque", query = "SELECT d FROM DireccionEntity d WHERE d.bloque = :bloque")
//    , @NamedQuery(name = "DireccionEntity.findByPredeterminado", query = "SELECT d FROM DireccionEntity d WHERE d.predeterminado = :predeterminado")
//    , @NamedQuery(name = "DireccionEntity.findByActivo", query = "SELECT d FROM DireccionEntity d WHERE d.activo = :activo")
//    , @NamedQuery(name = "DireccionEntity.findByUsuReg", query = "SELECT d FROM DireccionEntity d WHERE d.usuReg = :usuReg")
//    , @NamedQuery(name = "DireccionEntity.findByFecReg", query = "SELECT d FROM DireccionEntity d WHERE d.fecReg = :fecReg")
//    , @NamedQuery(name = "DireccionEntity.findByUsuModif", query = "SELECT d FROM DireccionEntity d WHERE d.usuModif = :usuModif")
//    , @NamedQuery(name = "DireccionEntity.findByFecModif", query = "SELECT d FROM DireccionEntity d WHERE d.fecModif = :fecModif")})
public class DireccionEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_direccion_id")
//    private Integer id;
    @Column(name = "urbanizacion")
    private String urbanizacion;
    @Column(name = "avenida")
    private String avenida;
    @Column(name = "jiron")
    private String jiron;
    @Column(name = "calle")
    private String calle;
    @Column(name = "manzana")
    private String manzana;
    @Column(name = "lote")
    private String lote;
    @Column(name = "numero")
    private String numero;
    @Column(name = "letra")
    private String letra;
    @Column(name = "piso")
    private Integer piso;
    @Column(name = "bloque")
    private String bloque;
    @Column(name = "predeterminado")
    private Integer predeterminado;
//    @Column(name = "activo")
//    private Integer activo;
//    @Column(name = "usu_reg")
//    private String usuReg;
//    @Column(name = "fec_reg")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fecReg;
//    @Column(name = "usu_modif")
//    private String usuModif;
//    @Column(name = "fec_modif")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fecModif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbDireccionId")
    private List<PedidoEntity> pedidoEntityList;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne
    private ClienteEntity tbClienteId;
    @JoinColumn(name = "tb_datos_personales_id", referencedColumnName = "tb_datos_personales_id")
    @ManyToOne
    private DatosPersonalesEntity tbDatosPersonalesId;
    @JoinColumn(name = "tb_ubigeo_id", referencedColumnName = "tb_ubigeo_id")
    @ManyToOne(optional = false)
    private UbigeoEntity tbUbigeoId;

    public DireccionEntity() {
    }

    public DireccionEntity(Integer tbDireccionId) {
        this.id = tbDireccionId;
    }

    public Integer getTbDireccionId() {
        return id;
    }

    public void setTbDireccionId(Integer tbDireccionId) {
        this.id = tbDireccionId;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getJiron() {
        return jiron;
    }

    public void setJiron(String jiron) {
        this.jiron = jiron;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public Integer getPredeterminado() {
        return predeterminado;
    }

    public void setPredeterminado(Integer predeterminado) {
        this.predeterminado = predeterminado;
    }

    @XmlTransient
    public List<PedidoEntity> getPedidoEntityList() {
        return pedidoEntityList;
    }

    public void setPedidoEntityList(List<PedidoEntity> pedidoEntityList) {
        this.pedidoEntityList = pedidoEntityList;
    }

    public ClienteEntity getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(ClienteEntity tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public DatosPersonalesEntity getTbDatosPersonalesId() {
        return tbDatosPersonalesId;
    }

    public void setTbDatosPersonalesId(DatosPersonalesEntity tbDatosPersonalesId) {
        this.tbDatosPersonalesId = tbDatosPersonalesId;
    }

    public UbigeoEntity getTbUbigeoId() {
        return tbUbigeoId;
    }

    public void setTbUbigeoId(UbigeoEntity tbUbigeoId) {
        this.tbUbigeoId = tbUbigeoId;
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
        if (!(object instanceof DireccionEntity)) {
            return false;
        }
        DireccionEntity other = (DireccionEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.DireccionEntity[ tbDireccionId=" + id + " ]";
    }
    
}
