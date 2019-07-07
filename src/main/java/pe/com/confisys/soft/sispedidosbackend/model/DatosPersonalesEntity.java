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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_datos_personales")
@AttributeOverride(name="id", column=@Column(name="tb_datos_personales_id"))
@XmlRootElement
@JsonRootName(value = "datosPersonales")
//@NamedQueries({
//    @NamedQuery(name = "DatosPersonalesEntity.findAll", query = "SELECT d FROM DatosPersonalesEntity d")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByTbDatosPersonalesId", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.tbDatosPersonalesId = :tbDatosPersonalesId")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByCodTipoDocumento", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.codTipoDocumento = :codTipoDocumento")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByNumDocumento", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.numDocumento = :numDocumento")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByNombres", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.nombres = :nombres")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByApellidoPaterno", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.apellidoPaterno = :apellidoPaterno")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByApellidoMaterno", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.apellidoMaterno = :apellidoMaterno")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByEmail", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.email = :email")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByFecNacimiento", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.fecNacimiento = :fecNacimiento")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByCelular", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.celular = :celular")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByTelefono1", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.telefono1 = :telefono1")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByTelefono2", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.telefono2 = :telefono2")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByActivo", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.activo = :activo")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByUsuReg", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.usuReg = :usuReg")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByFecReg", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.fecReg = :fecReg")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByUsuModif", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.usuModif = :usuModif")
//    , @NamedQuery(name = "DatosPersonalesEntity.findByFecModif", query = "SELECT d FROM DatosPersonalesEntity d WHERE d.fecModif = :fecModif")})
public class DatosPersonalesEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -392110948850087231L;

    @Column(name = "cod_tipo_documento")
    private String codTipoDocumento;
    @Column(name = "num_documento")
    private String numDocumento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "email")
    private String email;
    @Column(name = "fec_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fecNacimiento;
    @Column(name = "celular")
    private String celular;
    @Column(name = "telefono1")
    private String telefono1;
    @Column(name = "telefono2")
    private String telefono2;
    @OneToMany(mappedBy = "tbDatosPersonalesId")
    private List<DireccionEntity> direccionEntityList;

    public DatosPersonalesEntity() {
    }

    public DatosPersonalesEntity(Integer tbDatosPersonalesId) {
        this.id = tbDatosPersonalesId;
    }

    public Integer getTbDatosPersonalesId() {
        return id;
    }

    public void setTbDatosPersonalesId(Integer tbDatosPersonalesId) {
        this.id = tbDatosPersonalesId;
    }

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

//    public EmpleadoEntity getTbEmpleadoId() {
//        return tbEmpleadoId;
//    }
//
//    public void setTbEmpleadoId(EmpleadoEntity tbEmpleadoId) {
//        this.tbEmpleadoId = tbEmpleadoId;
//    }

//    public PersonaContactoEntity getTbPersonaContactoId() {
//        return tbPersonaContactoId;
//    }
//
//    public void setTbPersonaContactoId(PersonaContactoEntity tbPersonaContactoId) {
//        this.tbPersonaContactoId = tbPersonaContactoId;
//    }

    @XmlTransient
    public List<DireccionEntity> getDireccionEntityList() {
        return direccionEntityList;
    }

    public void setDireccionEntityList(List<DireccionEntity> direccionEntityList) {
        this.direccionEntityList = direccionEntityList;
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
        if (!(object instanceof DatosPersonalesEntity)) {
            return false;
        }
        DatosPersonalesEntity other = (DatosPersonalesEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.DatosPersonalesEntity[ tbDatosPersonalesId=" + id + " ]";
    }
    
}
