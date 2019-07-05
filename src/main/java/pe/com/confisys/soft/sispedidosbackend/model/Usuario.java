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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_usuario_id")
    private Integer tbUsuarioId;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @Column(name = "en_sesion")
    private Integer enSesion;
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
    @JoinColumn(name = "tb_empleado_id", referencedColumnName = "tb_empleado_id")
    @ManyToOne(optional = false)
    private Empleado tbEmpleadoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUsuarioId")
    private List<RolUsuario> rolUsuarioList;

    public Usuario() {
    }

    public Usuario(Integer tbUsuarioId) {
        this.tbUsuarioId = tbUsuarioId;
    }

    public Integer getTbUsuarioId() {
        return tbUsuarioId;
    }

    public void setTbUsuarioId(Integer tbUsuarioId) {
        this.tbUsuarioId = tbUsuarioId;
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

    public Empleado getTbEmpleadoId() {
        return tbEmpleadoId;
    }

    public void setTbEmpleadoId(Empleado tbEmpleadoId) {
        this.tbEmpleadoId = tbEmpleadoId;
    }

    @XmlTransient
    public List<RolUsuario> getRolUsuarioList() {
        return rolUsuarioList;
    }

    public void setRolUsuarioList(List<RolUsuario> rolUsuarioList) {
        this.rolUsuarioList = rolUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbUsuarioId != null ? tbUsuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.tbUsuarioId == null && other.tbUsuarioId != null) || (this.tbUsuarioId != null && !this.tbUsuarioId.equals(other.tbUsuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Usuario[ tbUsuarioId=" + tbUsuarioId + " ]";
    }
    
}
