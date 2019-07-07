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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_usuario")
@AttributeOverride(name="id", column=@Column(name="tb_usuario_id"))
@XmlRootElement
@JsonRootName("usuario")
//@NamedQueries({
//    @NamedQuery(name = "UsuarioEntity.findAll", query = "SELECT u FROM UsuarioEntity u")
//    , @NamedQuery(name = "UsuarioEntity.findByTbUsuarioId", query = "SELECT u FROM UsuarioEntity u WHERE u.tbUsuarioId = :tbUsuarioId")
//    , @NamedQuery(name = "UsuarioEntity.findByUsuario", query = "SELECT u FROM UsuarioEntity u WHERE u.usuario = :usuario")
//    , @NamedQuery(name = "UsuarioEntity.findByPassword", query = "SELECT u FROM UsuarioEntity u WHERE u.password = :password")
//    , @NamedQuery(name = "UsuarioEntity.findByEnSesion", query = "SELECT u FROM UsuarioEntity u WHERE u.enSesion = :enSesion")
//    , @NamedQuery(name = "UsuarioEntity.findByActivo", query = "SELECT u FROM UsuarioEntity u WHERE u.activo = :activo")
//    , @NamedQuery(name = "UsuarioEntity.findByUsuReg", query = "SELECT u FROM UsuarioEntity u WHERE u.usuReg = :usuReg")
//    , @NamedQuery(name = "UsuarioEntity.findByFecReg", query = "SELECT u FROM UsuarioEntity u WHERE u.fecReg = :fecReg")
//    , @NamedQuery(name = "UsuarioEntity.findByUsuModif", query = "SELECT u FROM UsuarioEntity u WHERE u.usuModif = :usuModif")
//    , @NamedQuery(name = "UsuarioEntity.findByFecModif", query = "SELECT u FROM UsuarioEntity u WHERE u.fecModif = :fecModif")})
public class UsuarioEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_usuario_id")
//    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @Column(name = "en_sesion")
    private Integer enSesion;
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
    @JoinColumn(name = "tb_empleado_id", referencedColumnName = "tb_empleado_id")
    @ManyToOne(optional = false)
    private EmpleadoEntity tbEmpleadoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUsuarioId")
    private List<RolUsuarioEntity> rolUsuarioEntityList;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Integer tbUsuarioId) {
        this.id = tbUsuarioId;
    }

    public Integer getTbUsuarioId() {
        return id;
    }

    public void setTbUsuarioId(Integer tbUsuarioId) {
        this.id = tbUsuarioId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnSesion() {
        return enSesion;
    }

    public void setEnSesion(Integer enSesion) {
        this.enSesion = enSesion;
    }

    public EmpleadoEntity getTbEmpleadoId() {
        return tbEmpleadoId;
    }

    public void setTbEmpleadoId(EmpleadoEntity tbEmpleadoId) {
        this.tbEmpleadoId = tbEmpleadoId;
    }

    @XmlTransient
    public List<RolUsuarioEntity> getRolUsuarioEntityList() {
        return rolUsuarioEntityList;
    }

    public void setRolUsuarioEntityList(List<RolUsuarioEntity> rolUsuarioEntityList) {
        this.rolUsuarioEntityList = rolUsuarioEntityList;
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
        if (!(object instanceof UsuarioEntity)) {
            return false;
        }
        UsuarioEntity other = (UsuarioEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.UsuarioEntity[ tbUsuarioId=" + id + " ]";
    }
    
}
