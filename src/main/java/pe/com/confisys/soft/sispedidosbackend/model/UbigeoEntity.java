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
@Table(name = "tb_ubigeo")
@AttributeOverride(name="id", column=@Column(name="tb_ubigeo_id"))
@XmlRootElement
@JsonRootName("ubigeo")
//@NamedQueries({
//    @NamedQuery(name = "UbigeoEntity.findAll", query = "SELECT u FROM UbigeoEntity u")
//    , @NamedQuery(name = "UbigeoEntity.findByTbUbigeoId", query = "SELECT u FROM UbigeoEntity u WHERE u.tbUbigeoId = :tbUbigeoId")
//    , @NamedQuery(name = "UbigeoEntity.findByDescripcion", query = "SELECT u FROM UbigeoEntity u WHERE u.descripcion = :descripcion")
//    , @NamedQuery(name = "UbigeoEntity.findByActivo", query = "SELECT u FROM UbigeoEntity u WHERE u.activo = :activo")
//    , @NamedQuery(name = "UbigeoEntity.findByUsuReg", query = "SELECT u FROM UbigeoEntity u WHERE u.usuReg = :usuReg")
//    , @NamedQuery(name = "UbigeoEntity.findByFecReg", query = "SELECT u FROM UbigeoEntity u WHERE u.fecReg = :fecReg")
//    , @NamedQuery(name = "UbigeoEntity.findByUsuModif", query = "SELECT u FROM UbigeoEntity u WHERE u.usuModif = :usuModif")
//    , @NamedQuery(name = "UbigeoEntity.findByFecModif", query = "SELECT u FROM UbigeoEntity u WHERE u.fecModif = :fecModif")})
public class UbigeoEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_ubigeo_id")
//    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUbigeoId")
    private List<DireccionEntity> direccionEntityList;

    public UbigeoEntity() {
    }

    public UbigeoEntity(Integer tbUbigeoId) {
        this.id = tbUbigeoId;
    }

    public Integer getTbUbigeoId() {
        return id;
    }

    public void setTbUbigeoId(Integer tbUbigeoId) {
        this.id = tbUbigeoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof UbigeoEntity)) {
            return false;
        }
        UbigeoEntity other = (UbigeoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.UbigeoEntity[ tbUbigeoId=" + id + " ]";
    }
    
}
