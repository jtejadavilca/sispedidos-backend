/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_rol_menu")
@AttributeOverride(name="id", column=@Column(name="tb_rol_menu_id"))
@XmlRootElement
@JsonRootName("rolMenu")
//@NamedQueries({
//    @NamedQuery(name = "RolMenuEntity.findAll", query = "SELECT r FROM RolMenuEntity r")
//    , @NamedQuery(name = "RolMenuEntity.findByTbRolMenuId", query = "SELECT r FROM RolMenuEntity r WHERE r.tbRolMenuId = :tbRolMenuId")
//    , @NamedQuery(name = "RolMenuEntity.findByActivo", query = "SELECT r FROM RolMenuEntity r WHERE r.activo = :activo")
//    , @NamedQuery(name = "RolMenuEntity.findByUsuReg", query = "SELECT r FROM RolMenuEntity r WHERE r.usuReg = :usuReg")
//    , @NamedQuery(name = "RolMenuEntity.findByFecReg", query = "SELECT r FROM RolMenuEntity r WHERE r.fecReg = :fecReg")
//    , @NamedQuery(name = "RolMenuEntity.findByUsuModif", query = "SELECT r FROM RolMenuEntity r WHERE r.usuModif = :usuModif")
//    , @NamedQuery(name = "RolMenuEntity.findByFecModif", query = "SELECT r FROM RolMenuEntity r WHERE r.fecModif = :fecModif")})
public class RolMenuEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "tb_menu_id", referencedColumnName = "tb_menu_id")
    @ManyToOne(optional = false)
    private MenuEntity tbMenuId;
    @JoinColumn(name = "tb_rol_id", referencedColumnName = "tb_rol_id")
    @ManyToOne(optional = false)
    private RolEntity tbRolId;

    public RolMenuEntity() {
    }

    public RolMenuEntity(Integer tbRolMenuId) {
        this.id = tbRolMenuId;
    }

    public Integer getTbRolMenuId() {
        return id;
    }

    public void setTbRolMenuId(Integer tbRolMenuId) {
        this.id = tbRolMenuId;
    }

    public MenuEntity getTbMenuId() {
        return tbMenuId;
    }

    public void setTbMenuId(MenuEntity tbMenuId) {
        this.tbMenuId = tbMenuId;
    }

    public RolEntity getTbRolId() {
        return tbRolId;
    }

    public void setTbRolId(RolEntity tbRolId) {
        this.tbRolId = tbRolId;
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
        if (!(object instanceof RolMenuEntity)) {
            return false;
        }
        RolMenuEntity other = (RolMenuEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.RolMenuEntity[ tbRolMenuId=" + id + " ]";
    }
    
}
