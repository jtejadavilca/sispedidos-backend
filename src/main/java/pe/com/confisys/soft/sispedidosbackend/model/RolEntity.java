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
@Table(name = "tb_rol")
@AttributeOverride(name="id", column=@Column(name="tb_rol_id"))
@XmlRootElement
@JsonRootName("rol")
//@NamedQueries({
//    @NamedQuery(name = "RolEntity.findAll", query = "SELECT r FROM RolEntity r")
//    , @NamedQuery(name = "RolEntity.findByTbRolId", query = "SELECT r FROM RolEntity r WHERE r.tbRolId = :tbRolId")
//    , @NamedQuery(name = "RolEntity.findByDescripcion", query = "SELECT r FROM RolEntity r WHERE r.descripcion = :descripcion")
//    , @NamedQuery(name = "RolEntity.findByActivo", query = "SELECT r FROM RolEntity r WHERE r.activo = :activo")
//    , @NamedQuery(name = "RolEntity.findByUsuReg", query = "SELECT r FROM RolEntity r WHERE r.usuReg = :usuReg")
//    , @NamedQuery(name = "RolEntity.findByFecReg", query = "SELECT r FROM RolEntity r WHERE r.fecReg = :fecReg")
//    , @NamedQuery(name = "RolEntity.findByUsuModif", query = "SELECT r FROM RolEntity r WHERE r.usuModif = :usuModif")
//    , @NamedQuery(name = "RolEntity.findByFecModif", query = "SELECT r FROM RolEntity r WHERE r.fecModif = :fecModif")})
public class RolEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_rol_id")
//    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbRolId")
    private List<RolUsuarioEntity> rolUsuarioEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbRolId")
    private List<RolMenuEntity> rolMenuEntityList;

    public RolEntity() {
    }

    public RolEntity(Integer tbRolId) {
        this.id = tbRolId;
    }

    public Integer getTbRolId() {
        return id;
    }

    public void setTbRolId(Integer tbRolId) {
        this.id = tbRolId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<RolUsuarioEntity> getRolUsuarioEntityList() {
        return rolUsuarioEntityList;
    }

    public void setRolUsuarioEntityList(List<RolUsuarioEntity> rolUsuarioEntityList) {
        this.rolUsuarioEntityList = rolUsuarioEntityList;
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
        if (!(object instanceof RolEntity)) {
            return false;
        }
        RolEntity other = (RolEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.RolEntity[ tbRolId=" + id + " ]";
    }
    
}
