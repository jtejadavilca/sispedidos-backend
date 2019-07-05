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
@Table(name = "tb_rol_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolMenu.findAll", query = "SELECT r FROM RolMenu r")
    , @NamedQuery(name = "RolMenu.findByTbRolMenuId", query = "SELECT r FROM RolMenu r WHERE r.tbRolMenuId = :tbRolMenuId")
    , @NamedQuery(name = "RolMenu.findByActivo", query = "SELECT r FROM RolMenu r WHERE r.activo = :activo")
    , @NamedQuery(name = "RolMenu.findByUsuReg", query = "SELECT r FROM RolMenu r WHERE r.usuReg = :usuReg")
    , @NamedQuery(name = "RolMenu.findByFecReg", query = "SELECT r FROM RolMenu r WHERE r.fecReg = :fecReg")
    , @NamedQuery(name = "RolMenu.findByUsuModif", query = "SELECT r FROM RolMenu r WHERE r.usuModif = :usuModif")
    , @NamedQuery(name = "RolMenu.findByFecModif", query = "SELECT r FROM RolMenu r WHERE r.fecModif = :fecModif")})
public class RolMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_rol_menu_id")
    private Integer tbRolMenuId;
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
    @JoinColumn(name = "tb_menu_id", referencedColumnName = "tb_menu_id")
    @ManyToOne(optional = false)
    private Menu tbMenuId;
    @JoinColumn(name = "tb_rol_id", referencedColumnName = "tb_rol_id")
    @ManyToOne(optional = false)
    private Rol tbRolId;

    public RolMenu() {
    }

    public RolMenu(Integer tbRolMenuId) {
        this.tbRolMenuId = tbRolMenuId;
    }

    public Integer getTbRolMenuId() {
        return tbRolMenuId;
    }

    public void setTbRolMenuId(Integer tbRolMenuId) {
        this.tbRolMenuId = tbRolMenuId;
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

    public Menu getTbMenuId() {
        return tbMenuId;
    }

    public void setTbMenuId(Menu tbMenuId) {
        this.tbMenuId = tbMenuId;
    }

    public Rol getTbRolId() {
        return tbRolId;
    }

    public void setTbRolId(Rol tbRolId) {
        this.tbRolId = tbRolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbRolMenuId != null ? tbRolMenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolMenu)) {
            return false;
        }
        RolMenu other = (RolMenu) object;
        if ((this.tbRolMenuId == null && other.tbRolMenuId != null) || (this.tbRolMenuId != null && !this.tbRolMenuId.equals(other.tbRolMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.RolMenu[ tbRolMenuId=" + tbRolMenuId + " ]";
    }
    
}
