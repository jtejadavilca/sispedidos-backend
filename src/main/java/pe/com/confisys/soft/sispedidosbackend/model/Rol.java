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
@Table(name = "tb_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findByTbRolId", query = "SELECT r FROM Rol r WHERE r.tbRolId = :tbRolId")
    , @NamedQuery(name = "Rol.findByDescripcion", query = "SELECT r FROM Rol r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Rol.findByActivo", query = "SELECT r FROM Rol r WHERE r.activo = :activo")
    , @NamedQuery(name = "Rol.findByUsuReg", query = "SELECT r FROM Rol r WHERE r.usuReg = :usuReg")
    , @NamedQuery(name = "Rol.findByFecReg", query = "SELECT r FROM Rol r WHERE r.fecReg = :fecReg")
    , @NamedQuery(name = "Rol.findByUsuModif", query = "SELECT r FROM Rol r WHERE r.usuModif = :usuModif")
    , @NamedQuery(name = "Rol.findByFecModif", query = "SELECT r FROM Rol r WHERE r.fecModif = :fecModif")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_rol_id")
    private Integer tbRolId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbRolId")
    private List<RolUsuario> rolUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbRolId")
    private List<RolMenu> rolMenuList;

    public Rol() {
    }

    public Rol(Integer tbRolId) {
        this.tbRolId = tbRolId;
    }

    public Integer getTbRolId() {
        return tbRolId;
    }

    public void setTbRolId(Integer tbRolId) {
        this.tbRolId = tbRolId;
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
    public List<RolUsuario> getRolUsuarioList() {
        return rolUsuarioList;
    }

    public void setRolUsuarioList(List<RolUsuario> rolUsuarioList) {
        this.rolUsuarioList = rolUsuarioList;
    }

    @XmlTransient
    public List<RolMenu> getRolMenuList() {
        return rolMenuList;
    }

    public void setRolMenuList(List<RolMenu> rolMenuList) {
        this.rolMenuList = rolMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbRolId != null ? tbRolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.tbRolId == null && other.tbRolId != null) || (this.tbRolId != null && !this.tbRolId.equals(other.tbRolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Rol[ tbRolId=" + tbRolId + " ]";
    }
    
}
