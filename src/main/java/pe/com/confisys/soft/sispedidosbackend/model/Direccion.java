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
@Table(name = "tb_direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
    , @NamedQuery(name = "Direccion.findByTbDireccionId", query = "SELECT d FROM Direccion d WHERE d.tbDireccionId = :tbDireccionId")
    , @NamedQuery(name = "Direccion.findByUrbanizacion", query = "SELECT d FROM Direccion d WHERE d.urbanizacion = :urbanizacion")
    , @NamedQuery(name = "Direccion.findByAvenida", query = "SELECT d FROM Direccion d WHERE d.avenida = :avenida")
    , @NamedQuery(name = "Direccion.findByJiron", query = "SELECT d FROM Direccion d WHERE d.jiron = :jiron")
    , @NamedQuery(name = "Direccion.findByCalle", query = "SELECT d FROM Direccion d WHERE d.calle = :calle")
    , @NamedQuery(name = "Direccion.findByManzana", query = "SELECT d FROM Direccion d WHERE d.manzana = :manzana")
    , @NamedQuery(name = "Direccion.findByLote", query = "SELECT d FROM Direccion d WHERE d.lote = :lote")
    , @NamedQuery(name = "Direccion.findByNumero", query = "SELECT d FROM Direccion d WHERE d.numero = :numero")
    , @NamedQuery(name = "Direccion.findByLetra", query = "SELECT d FROM Direccion d WHERE d.letra = :letra")
    , @NamedQuery(name = "Direccion.findByPiso", query = "SELECT d FROM Direccion d WHERE d.piso = :piso")
    , @NamedQuery(name = "Direccion.findByBloque", query = "SELECT d FROM Direccion d WHERE d.bloque = :bloque")
    , @NamedQuery(name = "Direccion.findByPredeterminado", query = "SELECT d FROM Direccion d WHERE d.predeterminado = :predeterminado")
    , @NamedQuery(name = "Direccion.findByActivo", query = "SELECT d FROM Direccion d WHERE d.activo = :activo")
    , @NamedQuery(name = "Direccion.findByUsuReg", query = "SELECT d FROM Direccion d WHERE d.usuReg = :usuReg")
    , @NamedQuery(name = "Direccion.findByFecReg", query = "SELECT d FROM Direccion d WHERE d.fecReg = :fecReg")
    , @NamedQuery(name = "Direccion.findByUsuModif", query = "SELECT d FROM Direccion d WHERE d.usuModif = :usuModif")
    , @NamedQuery(name = "Direccion.findByFecModif", query = "SELECT d FROM Direccion d WHERE d.fecModif = :fecModif")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_direccion_id")
    private Integer tbDireccionId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbDireccionId")
    private List<Pedido> pedidoList;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne
    private Cliente tbClienteId;
    @JoinColumn(name = "tb_datos_personales_id", referencedColumnName = "tb_datos_personales_id")
    @ManyToOne
    private DatosPersonales tbDatosPersonalesId;
    @JoinColumn(name = "tb_ubigeo_id", referencedColumnName = "tb_ubigeo_id")
    @ManyToOne(optional = false)
    private Ubigeo tbUbigeoId;

    public Direccion() {
    }

    public Direccion(Integer tbDireccionId) {
        this.tbDireccionId = tbDireccionId;
    }

    public Integer getTbDireccionId() {
        return tbDireccionId;
    }

    public void setTbDireccionId(Integer tbDireccionId) {
        this.tbDireccionId = tbDireccionId;
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
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public Cliente getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(Cliente tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public DatosPersonales getTbDatosPersonalesId() {
        return tbDatosPersonalesId;
    }

    public void setTbDatosPersonalesId(DatosPersonales tbDatosPersonalesId) {
        this.tbDatosPersonalesId = tbDatosPersonalesId;
    }

    public Ubigeo getTbUbigeoId() {
        return tbUbigeoId;
    }

    public void setTbUbigeoId(Ubigeo tbUbigeoId) {
        this.tbUbigeoId = tbUbigeoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbDireccionId != null ? tbDireccionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.tbDireccionId == null && other.tbDireccionId != null) || (this.tbDireccionId != null && !this.tbDireccionId.equals(other.tbDireccionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Direccion[ tbDireccionId=" + tbDireccionId + " ]";
    }
    
}
