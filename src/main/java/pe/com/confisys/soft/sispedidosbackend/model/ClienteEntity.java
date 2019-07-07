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
@Table(name = "tb_cliente")
@AttributeOverride(name="id", column=@Column(name="tb_cliente_id"))
@XmlRootElement
@JsonRootName("cliente")
//@NamedQueries({
//    @NamedQuery(name = "ClienteEntity.findAll", query = "SELECT c FROM ClienteEntity c")
//    , @NamedQuery(name = "ClienteEntity.findByTbClienteId", query = "SELECT c FROM ClienteEntity c WHERE c.tbClienteId = :tbClienteId")
//    , @NamedQuery(name = "ClienteEntity.findByNumRuc", query = "SELECT c FROM ClienteEntity c WHERE c.numRuc = :numRuc")
//    , @NamedQuery(name = "ClienteEntity.findByRazonSocial", query = "SELECT c FROM ClienteEntity c WHERE c.razonSocial = :razonSocial")
//    , @NamedQuery(name = "ClienteEntity.findByCodZona", query = "SELECT c FROM ClienteEntity c WHERE c.codZona = :codZona")
//    , @NamedQuery(name = "ClienteEntity.findByActivo", query = "SELECT c FROM ClienteEntity c WHERE c.activo = :activo")
//    , @NamedQuery(name = "ClienteEntity.findByUsuReg", query = "SELECT c FROM ClienteEntity c WHERE c.usuReg = :usuReg")
//    , @NamedQuery(name = "ClienteEntity.findByFecReg", query = "SELECT c FROM ClienteEntity c WHERE c.fecReg = :fecReg")
//    , @NamedQuery(name = "ClienteEntity.findByUsuModif", query = "SELECT c FROM ClienteEntity c WHERE c.usuModif = :usuModif")
//    , @NamedQuery(name = "ClienteEntity.findByFecModif", query = "SELECT c FROM ClienteEntity c WHERE c.fecModif = :fecModif")})
public class ClienteEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_cliente_id")
//    private Integer id;
    @Column(name = "num_ruc")
    private String numRuc;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "cod_zona")
    private String codZona;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbClienteId")
    private List<PedidoEntity> pedidoEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbClienteId")
    private List<PersonaContactoEntity> personaContactoEntityList;
    @OneToMany(mappedBy = "tbClienteId")
    private List<DireccionEntity> direccionEntityList;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer tbClienteId) {
        this.id = tbClienteId;
    }

    public Integer getTbClienteId() {
        return id;
    }

    public void setTbClienteId(Integer tbClienteId) {
        this.id = tbClienteId;
    }

    public String getNumRuc() {
        return numRuc;
    }

    public void setNumRuc(String numRuc) {
        this.numRuc = numRuc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }

    @XmlTransient
    public List<PedidoEntity> getPedidoEntityList() {
        return pedidoEntityList;
    }

    public void setPedidoEntityList(List<PedidoEntity> pedidoEntityList) {
        this.pedidoEntityList = pedidoEntityList;
    }

    @XmlTransient
    public List<PersonaContactoEntity> getPersonaContactoEntityList() {
        return personaContactoEntityList;
    }

    public void setPersonaContactoEntityList(List<PersonaContactoEntity> personaContactoEntityList) {
        this.personaContactoEntityList = personaContactoEntityList;
    }

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
        if (!(object instanceof ClienteEntity)) {
            return false;
        }
        ClienteEntity other = (ClienteEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.ClienteEntity[ tbClienteId=" + id + " ]";
    }
    
}
