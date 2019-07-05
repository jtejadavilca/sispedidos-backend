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
@Table(name = "tb_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByTbEmpleadoId", query = "SELECT e FROM Empleado e WHERE e.tbEmpleadoId = :tbEmpleadoId")
    , @NamedQuery(name = "Empleado.findByCodCargo", query = "SELECT e FROM Empleado e WHERE e.codCargo = :codCargo")
    , @NamedQuery(name = "Empleado.findByCodArea", query = "SELECT e FROM Empleado e WHERE e.codArea = :codArea")
    , @NamedQuery(name = "Empleado.findByCodZona", query = "SELECT e FROM Empleado e WHERE e.codZona = :codZona")
    , @NamedQuery(name = "Empleado.findByFecIniVigencia", query = "SELECT e FROM Empleado e WHERE e.fecIniVigencia = :fecIniVigencia")
    , @NamedQuery(name = "Empleado.findByFecFinVigencia", query = "SELECT e FROM Empleado e WHERE e.fecFinVigencia = :fecFinVigencia")
    , @NamedQuery(name = "Empleado.findByActivo", query = "SELECT e FROM Empleado e WHERE e.activo = :activo")
    , @NamedQuery(name = "Empleado.findByUsuReg", query = "SELECT e FROM Empleado e WHERE e.usuReg = :usuReg")
    , @NamedQuery(name = "Empleado.findByFecReg", query = "SELECT e FROM Empleado e WHERE e.fecReg = :fecReg")
    , @NamedQuery(name = "Empleado.findByUsuModif", query = "SELECT e FROM Empleado e WHERE e.usuModif = :usuModif")
    , @NamedQuery(name = "Empleado.findByFecModif", query = "SELECT e FROM Empleado e WHERE e.fecModif = :fecModif")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_empleado_id")
    private Integer tbEmpleadoId;
    @Column(name = "cod_cargo")
    private String codCargo;
    @Column(name = "cod_area")
    private String codArea;
    @Column(name = "cod_zona")
    private String codZona;
    @Column(name = "fec_ini_vigencia")
    @Temporal(TemporalType.DATE)
    private Date fecIniVigencia;
    @Column(name = "fec_fin_vigencia")
    @Temporal(TemporalType.DATE)
    private Date fecFinVigencia;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEmpleadoId")
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "tbEmpleadoId")
    private List<DatosPersonales> datosPersonalesList;

    public Empleado() {
    }

    public Empleado(Integer tbEmpleadoId) {
        this.tbEmpleadoId = tbEmpleadoId;
    }

    public Integer getTbEmpleadoId() {
        return tbEmpleadoId;
    }

    public void setTbEmpleadoId(Integer tbEmpleadoId) {
        this.tbEmpleadoId = tbEmpleadoId;
    }

    public String getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }

    public Date getFecIniVigencia() {
        return fecIniVigencia;
    }

    public void setFecIniVigencia(Date fecIniVigencia) {
        this.fecIniVigencia = fecIniVigencia;
    }

    public Date getFecFinVigencia() {
        return fecFinVigencia;
    }

    public void setFecFinVigencia(Date fecFinVigencia) {
        this.fecFinVigencia = fecFinVigencia;
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
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<DatosPersonales> getDatosPersonalesList() {
        return datosPersonalesList;
    }

    public void setDatosPersonalesList(List<DatosPersonales> datosPersonalesList) {
        this.datosPersonalesList = datosPersonalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbEmpleadoId != null ? tbEmpleadoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.tbEmpleadoId == null && other.tbEmpleadoId != null) || (this.tbEmpleadoId != null && !this.tbEmpleadoId.equals(other.tbEmpleadoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Empleado[ tbEmpleadoId=" + tbEmpleadoId + " ]";
    }
    
}
