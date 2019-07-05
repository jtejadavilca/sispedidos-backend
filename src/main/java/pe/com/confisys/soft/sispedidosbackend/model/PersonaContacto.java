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
@Table(name = "tb_persona_contacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaContacto.findAll", query = "SELECT p FROM PersonaContacto p")
    , @NamedQuery(name = "PersonaContacto.findByTbPersonaContactoId", query = "SELECT p FROM PersonaContacto p WHERE p.tbPersonaContactoId = :tbPersonaContactoId")
    , @NamedQuery(name = "PersonaContacto.findBySeleccionDefecto", query = "SELECT p FROM PersonaContacto p WHERE p.seleccionDefecto = :seleccionDefecto")
    , @NamedQuery(name = "PersonaContacto.findByActivo", query = "SELECT p FROM PersonaContacto p WHERE p.activo = :activo")
    , @NamedQuery(name = "PersonaContacto.findByUsuReg", query = "SELECT p FROM PersonaContacto p WHERE p.usuReg = :usuReg")
    , @NamedQuery(name = "PersonaContacto.findByFecReg", query = "SELECT p FROM PersonaContacto p WHERE p.fecReg = :fecReg")
    , @NamedQuery(name = "PersonaContacto.findByUsuModif", query = "SELECT p FROM PersonaContacto p WHERE p.usuModif = :usuModif")
    , @NamedQuery(name = "PersonaContacto.findByFecModif", query = "SELECT p FROM PersonaContacto p WHERE p.fecModif = :fecModif")})
public class PersonaContacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_persona_contacto_id")
    private Integer tbPersonaContactoId;
    @Column(name = "seleccion_defecto")
    private Integer seleccionDefecto;
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
    @OneToMany(mappedBy = "tbPersonaContactoId")
    private List<DatosPersonales> datosPersonalesList;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne(optional = false)
    private Cliente tbClienteId;

    public PersonaContacto() {
    }

    public PersonaContacto(Integer tbPersonaContactoId) {
        this.tbPersonaContactoId = tbPersonaContactoId;
    }

    public Integer getTbPersonaContactoId() {
        return tbPersonaContactoId;
    }

    public void setTbPersonaContactoId(Integer tbPersonaContactoId) {
        this.tbPersonaContactoId = tbPersonaContactoId;
    }

    public Integer getSeleccionDefecto() {
        return seleccionDefecto;
    }

    public void setSeleccionDefecto(Integer seleccionDefecto) {
        this.seleccionDefecto = seleccionDefecto;
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
    public List<DatosPersonales> getDatosPersonalesList() {
        return datosPersonalesList;
    }

    public void setDatosPersonalesList(List<DatosPersonales> datosPersonalesList) {
        this.datosPersonalesList = datosPersonalesList;
    }

    public Cliente getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(Cliente tbClienteId) {
        this.tbClienteId = tbClienteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbPersonaContactoId != null ? tbPersonaContactoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaContacto)) {
            return false;
        }
        PersonaContacto other = (PersonaContacto) object;
        if ((this.tbPersonaContactoId == null && other.tbPersonaContactoId != null) || (this.tbPersonaContactoId != null && !this.tbPersonaContactoId.equals(other.tbPersonaContactoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.PersonaContacto[ tbPersonaContactoId=" + tbPersonaContactoId + " ]";
    }
    
}
