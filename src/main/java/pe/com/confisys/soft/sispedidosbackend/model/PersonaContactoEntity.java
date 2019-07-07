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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_persona_contacto")
@AttributeOverride(name="id", column=@Column(name="tb_persona_contacto_id"))
@XmlRootElement
@JsonRootName("personaContacto")
//@NamedQueries({
//    @NamedQuery(name = "PersonaContactoEntity.findAll", query = "SELECT p FROM PersonaContactoEntity p")
//    , @NamedQuery(name = "PersonaContactoEntity.findByTbPersonaContactoId", query = "SELECT p FROM PersonaContactoEntity p WHERE p.tbPersonaContactoId = :tbPersonaContactoId")
//    , @NamedQuery(name = "PersonaContactoEntity.findBySeleccionDefecto", query = "SELECT p FROM PersonaContactoEntity p WHERE p.seleccionDefecto = :seleccionDefecto")
//    , @NamedQuery(name = "PersonaContactoEntity.findByActivo", query = "SELECT p FROM PersonaContactoEntity p WHERE p.activo = :activo")
//    , @NamedQuery(name = "PersonaContactoEntity.findByUsuReg", query = "SELECT p FROM PersonaContactoEntity p WHERE p.usuReg = :usuReg")
//    , @NamedQuery(name = "PersonaContactoEntity.findByFecReg", query = "SELECT p FROM PersonaContactoEntity p WHERE p.fecReg = :fecReg")
//    , @NamedQuery(name = "PersonaContactoEntity.findByUsuModif", query = "SELECT p FROM PersonaContactoEntity p WHERE p.usuModif = :usuModif")
//    , @NamedQuery(name = "PersonaContactoEntity.findByFecModif", query = "SELECT p FROM PersonaContactoEntity p WHERE p.fecModif = :fecModif")})
public class PersonaContactoEntity extends BaseEntity implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -3366341176132104485L;

	@Column(name = "seleccion_defecto")
    private Integer seleccionDefecto;
    @JoinColumn(name = "tb_cliente_id", referencedColumnName = "tb_cliente_id")
    @ManyToOne(optional = false)
    private ClienteEntity tbClienteId;
    
    @OneToOne 
    @JoinColumn(name = "tb_datos_personales_id")
    private DatosPersonalesEntity datosPersonalesEntity;

    public PersonaContactoEntity() {
    }

    public PersonaContactoEntity(Integer tbPersonaContactoId) {
        this.id = tbPersonaContactoId;
    }

    public Integer getTbPersonaContactoId() {
        return id;
    }

    public void setTbPersonaContactoId(Integer tbPersonaContactoId) {
        this.id = tbPersonaContactoId;
    }

    public Integer getSeleccionDefecto() {
        return seleccionDefecto;
    }

    public void setSeleccionDefecto(Integer seleccionDefecto) {
        this.seleccionDefecto = seleccionDefecto;
    }

    @JsonGetter("datosPersonales")
    public DatosPersonalesEntity getDatosPersonalesEntity() {
		return datosPersonalesEntity;
	}

	public void setDatosPersonalesEntity(DatosPersonalesEntity datosPersonalesEntity) {
		this.datosPersonalesEntity = datosPersonalesEntity;
	}

	public ClienteEntity getTbClienteId() {
        return tbClienteId;
    }

    public void setTbClienteId(ClienteEntity tbClienteId) {
        this.tbClienteId = tbClienteId;
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
        if (!(object instanceof PersonaContactoEntity)) {
            return false;
        }
        PersonaContactoEntity other = (PersonaContactoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.PersonaContactoEntity[ tbPersonaContactoId=" + id + " ]";
    }
    
}
