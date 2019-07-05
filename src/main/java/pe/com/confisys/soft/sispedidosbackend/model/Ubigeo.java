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
@Table(name = "tb_ubigeo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u")
    , @NamedQuery(name = "Ubigeo.findByTbUbigeoId", query = "SELECT u FROM Ubigeo u WHERE u.tbUbigeoId = :tbUbigeoId")
    , @NamedQuery(name = "Ubigeo.findByDescripcion", query = "SELECT u FROM Ubigeo u WHERE u.descripcion = :descripcion")
    , @NamedQuery(name = "Ubigeo.findByActivo", query = "SELECT u FROM Ubigeo u WHERE u.activo = :activo")
    , @NamedQuery(name = "Ubigeo.findByUsuReg", query = "SELECT u FROM Ubigeo u WHERE u.usuReg = :usuReg")
    , @NamedQuery(name = "Ubigeo.findByFecReg", query = "SELECT u FROM Ubigeo u WHERE u.fecReg = :fecReg")
    , @NamedQuery(name = "Ubigeo.findByUsuModif", query = "SELECT u FROM Ubigeo u WHERE u.usuModif = :usuModif")
    , @NamedQuery(name = "Ubigeo.findByFecModif", query = "SELECT u FROM Ubigeo u WHERE u.fecModif = :fecModif")})
public class Ubigeo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_ubigeo_id")
    private Integer tbUbigeoId;
    @Column(name = "descripcion")
    private String descripcion;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUbigeoId")
    private List<Direccion> direccionList;

    public Ubigeo() {
    }

    public Ubigeo(Integer tbUbigeoId) {
        this.tbUbigeoId = tbUbigeoId;
    }

    public Integer getTbUbigeoId() {
        return tbUbigeoId;
    }

    public void setTbUbigeoId(Integer tbUbigeoId) {
        this.tbUbigeoId = tbUbigeoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbUbigeoId != null ? tbUbigeoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.tbUbigeoId == null && other.tbUbigeoId != null) || (this.tbUbigeoId != null && !this.tbUbigeoId.equals(other.tbUbigeoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Ubigeo[ tbUbigeoId=" + tbUbigeoId + " ]";
    }
    
}
