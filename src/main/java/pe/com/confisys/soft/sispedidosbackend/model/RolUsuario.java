/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_rol_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolUsuario.findAll", query = "SELECT r FROM RolUsuario r")
    , @NamedQuery(name = "RolUsuario.findByTbRolUsuarioId", query = "SELECT r FROM RolUsuario r WHERE r.tbRolUsuarioId = :tbRolUsuarioId")
    , @NamedQuery(name = "RolUsuario.findByActivo", query = "SELECT r FROM RolUsuario r WHERE r.activo = :activo")
    , @NamedQuery(name = "RolUsuario.findByUsuReg", query = "SELECT r FROM RolUsuario r WHERE r.usuReg = :usuReg")
    , @NamedQuery(name = "RolUsuario.findByFecReg", query = "SELECT r FROM RolUsuario r WHERE r.fecReg = :fecReg")
    , @NamedQuery(name = "RolUsuario.findByUsuModif", query = "SELECT r FROM RolUsuario r WHERE r.usuModif = :usuModif")
    , @NamedQuery(name = "RolUsuario.findByFecModif", query = "SELECT r FROM RolUsuario r WHERE r.fecModif = :fecModif")})
public class RolUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_rol_usuario_id")
    private Integer tbRolUsuarioId;
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
    @JoinColumn(name = "tb_rol_id", referencedColumnName = "tb_rol_id")
    @ManyToOne(optional = false)
    private Rol tbRolId;
    @JoinColumn(name = "tb_usuario_id", referencedColumnName = "tb_usuario_id")
    @ManyToOne(optional = false)
    private Usuario tbUsuarioId;

    public RolUsuario() {
    }

    public RolUsuario(Integer tbRolUsuarioId) {
        this.tbRolUsuarioId = tbRolUsuarioId;
    }

    public Integer getTbRolUsuarioId() {
        return tbRolUsuarioId;
    }

    public void setTbRolUsuarioId(Integer tbRolUsuarioId) {
        this.tbRolUsuarioId = tbRolUsuarioId;
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

    public Rol getTbRolId() {
        return tbRolId;
    }

    public void setTbRolId(Rol tbRolId) {
        this.tbRolId = tbRolId;
    }

    public Usuario getTbUsuarioId() {
        return tbUsuarioId;
    }

    public void setTbUsuarioId(Usuario tbUsuarioId) {
        this.tbUsuarioId = tbUsuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbRolUsuarioId != null ? tbRolUsuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolUsuario)) {
            return false;
        }
        RolUsuario other = (RolUsuario) object;
        if ((this.tbRolUsuarioId == null && other.tbRolUsuarioId != null) || (this.tbRolUsuarioId != null && !this.tbRolUsuarioId.equals(other.tbRolUsuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.RolUsuario[ tbRolUsuarioId=" + tbRolUsuarioId + " ]";
    }
    
}
