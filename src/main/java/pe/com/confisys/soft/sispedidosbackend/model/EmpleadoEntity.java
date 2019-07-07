/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_empleado")
@AttributeOverride(name="id", column=@Column(name="tb_empleado_id"))
@XmlRootElement
@JsonRootName("empleado")
//@NamedQueries({
//    @NamedQuery(name = "EmpleadoEntity.findAll", query = "SELECT e FROM EmpleadoEntity e")
//    , @NamedQuery(name = "EmpleadoEntity.findByTbEmpleadoId", query = "SELECT e FROM EmpleadoEntity e WHERE e.tbEmpleadoId = :tbEmpleadoId")
//    , @NamedQuery(name = "EmpleadoEntity.findByCodCargo", query = "SELECT e FROM EmpleadoEntity e WHERE e.codCargo = :codCargo")
//    , @NamedQuery(name = "EmpleadoEntity.findByCodArea", query = "SELECT e FROM EmpleadoEntity e WHERE e.codArea = :codArea")
//    , @NamedQuery(name = "EmpleadoEntity.findByCodZona", query = "SELECT e FROM EmpleadoEntity e WHERE e.codZona = :codZona")
//    , @NamedQuery(name = "EmpleadoEntity.findByFecIniVigencia", query = "SELECT e FROM EmpleadoEntity e WHERE e.fecIniVigencia = :fecIniVigencia")
//    , @NamedQuery(name = "EmpleadoEntity.findByFecFinVigencia", query = "SELECT e FROM EmpleadoEntity e WHERE e.fecFinVigencia = :fecFinVigencia")
//    , @NamedQuery(name = "EmpleadoEntity.findByActivo", query = "SELECT e FROM EmpleadoEntity e WHERE e.activo = :activo")
//    , @NamedQuery(name = "EmpleadoEntity.findByUsuReg", query = "SELECT e FROM EmpleadoEntity e WHERE e.usuReg = :usuReg")
//    , @NamedQuery(name = "EmpleadoEntity.findByFecReg", query = "SELECT e FROM EmpleadoEntity e WHERE e.fecReg = :fecReg")
//    , @NamedQuery(name = "EmpleadoEntity.findByUsuModif", query = "SELECT e FROM EmpleadoEntity e WHERE e.usuModif = :usuModif")
//    , @NamedQuery(name = "EmpleadoEntity.findByFecModif", query = "SELECT e FROM EmpleadoEntity e WHERE e.fecModif = :fecModif")})
public class EmpleadoEntity extends BaseEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4481350608383331363L;

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEmpleadoId")
    private List<UsuarioEntity> usuarioEntityList;
    
    @OneToOne 
    @JoinColumn(name = "tb_datos_personales_id")
    private DatosPersonalesEntity datosPersonalesEntity;

    public EmpleadoEntity() {
    }

    public EmpleadoEntity(Integer tbEmpleadoId) {
        this.id = tbEmpleadoId;
    }

    public Integer getTbEmpleadoId() {
        return id;
    }

    public void setTbEmpleadoId(Integer tbEmpleadoId) {
        this.id = tbEmpleadoId;
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

    @XmlTransient
    public List<UsuarioEntity> getUsuarioEntityList() {
        return usuarioEntityList;
    }

    public void setUsuarioEntityList(List<UsuarioEntity> usuarioEntityList) {
        this.usuarioEntityList = usuarioEntityList;
    }

    @JsonGetter("datosPersonales")
    public DatosPersonalesEntity getDatosPersonalesEntity() {
		return datosPersonalesEntity;
	}

	public void setDatosPersonalesEntity(DatosPersonalesEntity datosPersonalesEntity) {
		this.datosPersonalesEntity = datosPersonalesEntity;
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
        if (!(object instanceof EmpleadoEntity)) {
            return false;
        }
        EmpleadoEntity other = (EmpleadoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.EmpleadoEntity[ tbEmpleadoId=" + id + " ]";
    }
    
}
