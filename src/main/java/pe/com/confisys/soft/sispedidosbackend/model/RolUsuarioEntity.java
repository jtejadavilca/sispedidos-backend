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
@Table(name = "tb_rol_usuario")
@AttributeOverride(name="id", column=@Column(name="tb_rol_usuario_id"))
@XmlRootElement
@JsonRootName("rolUsuario")
//@NamedQueries({
//    @NamedQuery(name = "RolUsuarioEntity.findAll", query = "SELECT r FROM RolUsuarioEntity r")
//    , @NamedQuery(name = "RolUsuarioEntity.findByTbRolUsuarioId", query = "SELECT r FROM RolUsuarioEntity r WHERE r.tbRolUsuarioId = :tbRolUsuarioId")
//    , @NamedQuery(name = "RolUsuarioEntity.findByActivo", query = "SELECT r FROM RolUsuarioEntity r WHERE r.activo = :activo")
//    , @NamedQuery(name = "RolUsuarioEntity.findByUsuReg", query = "SELECT r FROM RolUsuarioEntity r WHERE r.usuReg = :usuReg")
//    , @NamedQuery(name = "RolUsuarioEntity.findByFecReg", query = "SELECT r FROM RolUsuarioEntity r WHERE r.fecReg = :fecReg")
//    , @NamedQuery(name = "RolUsuarioEntity.findByUsuModif", query = "SELECT r FROM RolUsuarioEntity r WHERE r.usuModif = :usuModif")
//    , @NamedQuery(name = "RolUsuarioEntity.findByFecModif", query = "SELECT r FROM RolUsuarioEntity r WHERE r.fecModif = :fecModif")})
public class RolUsuarioEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_rol_usuario_id")
//    private Integer id;
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
    @JoinColumn(name = "tb_rol_id", referencedColumnName = "tb_rol_id")
    @ManyToOne(optional = false)
    private RolEntity tbRolId;
    @JoinColumn(name = "tb_usuario_id", referencedColumnName = "tb_usuario_id")
    @ManyToOne(optional = false)
    private UsuarioEntity tbUsuarioId;

    public RolUsuarioEntity() {
    }

    public RolUsuarioEntity(Integer tbRolUsuarioId) {
        this.id = tbRolUsuarioId;
    }

    public Integer getTbRolUsuarioId() {
        return id;
    }

    public void setTbRolUsuarioId(Integer tbRolUsuarioId) {
        this.id = tbRolUsuarioId;
    }

    public RolEntity getTbRolId() {
        return tbRolId;
    }

    public void setTbRolId(RolEntity tbRolId) {
        this.tbRolId = tbRolId;
    }

    public UsuarioEntity getTbUsuarioId() {
        return tbUsuarioId;
    }

    public void setTbUsuarioId(UsuarioEntity tbUsuarioId) {
        this.tbUsuarioId = tbUsuarioId;
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
        if (!(object instanceof RolUsuarioEntity)) {
            return false;
        }
        RolUsuarioEntity other = (RolUsuarioEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.RolUsuarioEntity[ tbRolUsuarioId=" + id + " ]";
    }
    
}
