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
@Table(name = "tb_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findByTbMenuId", query = "SELECT m FROM Menu m WHERE m.tbMenuId = :tbMenuId")
    , @NamedQuery(name = "Menu.findByDescripcion", query = "SELECT m FROM Menu m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Menu.findByIcono", query = "SELECT m FROM Menu m WHERE m.icono = :icono")
    , @NamedQuery(name = "Menu.findByVisibleWeb", query = "SELECT m FROM Menu m WHERE m.visibleWeb = :visibleWeb")
    , @NamedQuery(name = "Menu.findByVisibleMovil", query = "SELECT m FROM Menu m WHERE m.visibleMovil = :visibleMovil")
    , @NamedQuery(name = "Menu.findByActivo", query = "SELECT m FROM Menu m WHERE m.activo = :activo")
    , @NamedQuery(name = "Menu.findByUsuReg", query = "SELECT m FROM Menu m WHERE m.usuReg = :usuReg")
    , @NamedQuery(name = "Menu.findByFecReg", query = "SELECT m FROM Menu m WHERE m.fecReg = :fecReg")
    , @NamedQuery(name = "Menu.findByUsuModif", query = "SELECT m FROM Menu m WHERE m.usuModif = :usuModif")
    , @NamedQuery(name = "Menu.findByFecModif", query = "SELECT m FROM Menu m WHERE m.fecModif = :fecModif")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_menu_id")
    private Integer tbMenuId;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "icono")
    private String icono;
    @Column(name = "visible_web")
    private Integer visibleWeb;
    @Column(name = "visible_movil")
    private Integer visibleMovil;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbMenuId")
    private List<RolMenu> rolMenuList;

    public Menu() {
    }

    public Menu(Integer tbMenuId) {
        this.tbMenuId = tbMenuId;
    }

    public Integer getTbMenuId() {
        return tbMenuId;
    }

    public void setTbMenuId(Integer tbMenuId) {
        this.tbMenuId = tbMenuId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Integer getVisibleWeb() {
        return visibleWeb;
    }

    public void setVisibleWeb(Integer visibleWeb) {
        this.visibleWeb = visibleWeb;
    }

    public Integer getVisibleMovil() {
        return visibleMovil;
    }

    public void setVisibleMovil(Integer visibleMovil) {
        this.visibleMovil = visibleMovil;
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
    public List<RolMenu> getRolMenuList() {
        return rolMenuList;
    }

    public void setRolMenuList(List<RolMenu> rolMenuList) {
        this.rolMenuList = rolMenuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbMenuId != null ? tbMenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.tbMenuId == null && other.tbMenuId != null) || (this.tbMenuId != null && !this.tbMenuId.equals(other.tbMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Menu[ tbMenuId=" + tbMenuId + " ]";
    }
    
}
