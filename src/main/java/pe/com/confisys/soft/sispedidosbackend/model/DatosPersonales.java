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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_datos_personales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosPersonales.findAll", query = "SELECT d FROM DatosPersonales d")
    , @NamedQuery(name = "DatosPersonales.findByTbDatosPersonalesId", query = "SELECT d FROM DatosPersonales d WHERE d.tbDatosPersonalesId = :tbDatosPersonalesId")
    , @NamedQuery(name = "DatosPersonales.findByCodTipoDocumento", query = "SELECT d FROM DatosPersonales d WHERE d.codTipoDocumento = :codTipoDocumento")
    , @NamedQuery(name = "DatosPersonales.findByNumDocumento", query = "SELECT d FROM DatosPersonales d WHERE d.numDocumento = :numDocumento")
    , @NamedQuery(name = "DatosPersonales.findByNombres", query = "SELECT d FROM DatosPersonales d WHERE d.nombres = :nombres")
    , @NamedQuery(name = "DatosPersonales.findByApellidoPaterno", query = "SELECT d FROM DatosPersonales d WHERE d.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "DatosPersonales.findByApellidoMaterno", query = "SELECT d FROM DatosPersonales d WHERE d.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "DatosPersonales.findByEmail", query = "SELECT d FROM DatosPersonales d WHERE d.email = :email")
    , @NamedQuery(name = "DatosPersonales.findByFecNacimiento", query = "SELECT d FROM DatosPersonales d WHERE d.fecNacimiento = :fecNacimiento")
    , @NamedQuery(name = "DatosPersonales.findByCelular", query = "SELECT d FROM DatosPersonales d WHERE d.celular = :celular")
    , @NamedQuery(name = "DatosPersonales.findByTelefono1", query = "SELECT d FROM DatosPersonales d WHERE d.telefono1 = :telefono1")
    , @NamedQuery(name = "DatosPersonales.findByTelefono2", query = "SELECT d FROM DatosPersonales d WHERE d.telefono2 = :telefono2")
    , @NamedQuery(name = "DatosPersonales.findByActivo", query = "SELECT d FROM DatosPersonales d WHERE d.activo = :activo")
    , @NamedQuery(name = "DatosPersonales.findByUsuReg", query = "SELECT d FROM DatosPersonales d WHERE d.usuReg = :usuReg")
    , @NamedQuery(name = "DatosPersonales.findByFecReg", query = "SELECT d FROM DatosPersonales d WHERE d.fecReg = :fecReg")
    , @NamedQuery(name = "DatosPersonales.findByUsuModif", query = "SELECT d FROM DatosPersonales d WHERE d.usuModif = :usuModif")
    , @NamedQuery(name = "DatosPersonales.findByFecModif", query = "SELECT d FROM DatosPersonales d WHERE d.fecModif = :fecModif")})
public class DatosPersonales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_datos_personales_id")
    private Integer tbDatosPersonalesId;
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
    @ManyToOne
    private Empleado tbEmpleadoId;
    @JoinColumn(name = "tb_persona_contacto_id", referencedColumnName = "tb_persona_contacto_id")
    @ManyToOne
    private PersonaContacto tbPersonaContactoId;
    @OneToMany(mappedBy = "tbDatosPersonalesId")
    private List<Direccion> direccionList;

    public DatosPersonales() {
    }

    public DatosPersonales(Integer tbDatosPersonalesId) {
        this.tbDatosPersonalesId = tbDatosPersonalesId;
    }

    public Integer getTbDatosPersonalesId() {
        return tbDatosPersonalesId;
    }

    public void setTbDatosPersonalesId(Integer tbDatosPersonalesId) {
        this.tbDatosPersonalesId = tbDatosPersonalesId;
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

    public PersonaContacto getTbPersonaContactoId() {
        return tbPersonaContactoId;
    }

    public void setTbPersonaContactoId(PersonaContacto tbPersonaContactoId) {
        this.tbPersonaContactoId = tbPersonaContactoId;
    }

    @XmlTransient
    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbDatosPersonalesId != null ? tbDatosPersonalesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosPersonales)) {
            return false;
        }
        DatosPersonales other = (DatosPersonales) object;
        if ((this.tbDatosPersonalesId == null && other.tbDatosPersonalesId != null) || (this.tbDatosPersonalesId != null && !this.tbDatosPersonalesId.equals(other.tbDatosPersonalesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.DatosPersonales[ tbDatosPersonalesId=" + tbDatosPersonalesId + " ]";
    }
    
}
