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
@Table(name = "tb_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByTbClienteId", query = "SELECT c FROM Cliente c WHERE c.tbClienteId = :tbClienteId")
    , @NamedQuery(name = "Cliente.findByNumRuc", query = "SELECT c FROM Cliente c WHERE c.numRuc = :numRuc")
    , @NamedQuery(name = "Cliente.findByRazonSocial", query = "SELECT c FROM Cliente c WHERE c.razonSocial = :razonSocial")
    , @NamedQuery(name = "Cliente.findByCodZona", query = "SELECT c FROM Cliente c WHERE c.codZona = :codZona")
    , @NamedQuery(name = "Cliente.findByActivo", query = "SELECT c FROM Cliente c WHERE c.activo = :activo")
    , @NamedQuery(name = "Cliente.findByUsuReg", query = "SELECT c FROM Cliente c WHERE c.usuReg = :usuReg")
    , @NamedQuery(name = "Cliente.findByFecReg", query = "SELECT c FROM Cliente c WHERE c.fecReg = :fecReg")
    , @NamedQuery(name = "Cliente.findByUsuModif", query = "SELECT c FROM Cliente c WHERE c.usuModif = :usuModif")
    , @NamedQuery(name = "Cliente.findByFecModif", query = "SELECT c FROM Cliente c WHERE c.fecModif = :fecModif")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_cliente_id")
    private Integer tbClienteId;
    @Column(name = "num_ruc")
    private String numRuc;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "cod_zona")
    private String codZona;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbClienteId")
    private List<Pedido> pedidoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbClienteId")
    private List<PersonaContacto> personaContactoList;
    @OneToMany(mappedBy = "tbClienteId")
    private List<Direccion> direccionList;

    public Cliente() {
    }

    public Cliente(Integer tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public Integer getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(Integer tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    public String getNumRuc() {
        return numRuc;
    }

    public void setNumRuc(String numRuc) {
        this.numRuc = numRuc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
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

    @XmlTransient
    public List<PersonaContacto> getPersonaContactoList() {
        return personaContactoList;
    }

    public void setPersonaContactoList(List<PersonaContacto> personaContactoList) {
        this.personaContactoList = personaContactoList;
    }

    @XmlTransient
    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbClienteId != null ? tbClienteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.tbClienteId == null && other.tbClienteId != null) || (this.tbClienteId != null && !this.tbClienteId.equals(other.tbClienteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Cliente[ tbClienteId=" + tbClienteId + " ]";
    }
    
}
