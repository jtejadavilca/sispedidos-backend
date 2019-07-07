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
@Table(name = "tb_menu")
@AttributeOverride(name="id", column=@Column(name="tb_menu_id"))
@XmlRootElement
@JsonRootName("menu")
//@NamedQueries({
//    @NamedQuery(name = "MenuEntity.findAll", query = "SELECT m FROM MenuEntity m")
//    , @NamedQuery(name = "MenuEntity.findByTbMenuId", query = "SELECT m FROM MenuEntity m WHERE m.tbMenuId = :tbMenuId")
//    , @NamedQuery(name = "MenuEntity.findByDescripcion", query = "SELECT m FROM MenuEntity m WHERE m.descripcion = :descripcion")
//    , @NamedQuery(name = "MenuEntity.findByIcono", query = "SELECT m FROM MenuEntity m WHERE m.icono = :icono")
//    , @NamedQuery(name = "MenuEntity.findByVisibleWeb", query = "SELECT m FROM MenuEntity m WHERE m.visibleWeb = :visibleWeb")
//    , @NamedQuery(name = "MenuEntity.findByVisibleMovil", query = "SELECT m FROM MenuEntity m WHERE m.visibleMovil = :visibleMovil")
//    , @NamedQuery(name = "MenuEntity.findByActivo", query = "SELECT m FROM MenuEntity m WHERE m.activo = :activo")
//    , @NamedQuery(name = "MenuEntity.findByUsuReg", query = "SELECT m FROM MenuEntity m WHERE m.usuReg = :usuReg")
//    , @NamedQuery(name = "MenuEntity.findByFecReg", query = "SELECT m FROM MenuEntity m WHERE m.fecReg = :fecReg")
//    , @NamedQuery(name = "MenuEntity.findByUsuModif", query = "SELECT m FROM MenuEntity m WHERE m.usuModif = :usuModif")
//    , @NamedQuery(name = "MenuEntity.findByFecModif", query = "SELECT m FROM MenuEntity m WHERE m.fecModif = :fecModif")})
public class MenuEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_menu_id")
//    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "icono")
    private String icono;
    @Column(name = "visible_web")
    private Integer visibleWeb;
    @Column(name = "visible_movil")
    private Integer visibleMovil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbMenuId")
    private List<RolMenuEntity> rolMenuEntityList;

    public MenuEntity() {
    }

    public MenuEntity(Integer tbMenuId) {
        this.id = tbMenuId;
    }

    public Integer getTbMenuId() {
        return id;
    }

    public void setTbMenuId(Integer tbMenuId) {
        this.id = tbMenuId;
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

    @XmlTransient
    public List<RolMenuEntity> getRolMenuEntityList() {
        return rolMenuEntityList;
    }

    public void setRolMenuEntityList(List<RolMenuEntity> rolMenuEntityList) {
        this.rolMenuEntityList = rolMenuEntityList;
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
        if (!(object instanceof MenuEntity)) {
            return false;
        }
        MenuEntity other = (MenuEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.MenuEntity[ tbMenuId=" + id + " ]";
    }
    
}
