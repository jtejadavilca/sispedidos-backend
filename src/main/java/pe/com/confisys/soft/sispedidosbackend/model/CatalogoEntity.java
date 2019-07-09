/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "tb_catalogo")
@XmlRootElement
@JsonRootName("catalogo")
//@NamedQueries({
//    @NamedQuery(name = "CatalogoEntity.findAll", query = "SELECT c FROM CatalogoEntity c")
//    , @NamedQuery(name = "CatalogoEntity.findByParamCatalogo", query = "SELECT c FROM CatalogoEntity c WHERE c.catalogoEntityPK.paramCatalogo = :paramCatalogo")
//    , @NamedQuery(name = "CatalogoEntity.findByParamCatalogoElemento", query = "SELECT c FROM CatalogoEntity c WHERE c.catalogoEntityPK.paramCatalogoElemento = :paramCatalogoElemento")
//    , @NamedQuery(name = "CatalogoEntity.findByDescripcionCorta", query = "SELECT c FROM CatalogoEntity c WHERE c.descripcionCorta = :descripcionCorta")
//    , @NamedQuery(name = "CatalogoEntity.findByTipo", query = "SELECT c FROM CatalogoEntity c WHERE c.tipo = :tipo")
//    , @NamedQuery(name = "CatalogoEntity.findByActivo", query = "SELECT c FROM CatalogoEntity c WHERE c.activo = :activo")
//    , @NamedQuery(name = "CatalogoEntity.findByUsuReg", query = "SELECT c FROM CatalogoEntity c WHERE c.usuReg = :usuReg")
//    , @NamedQuery(name = "CatalogoEntity.findByFecReg", query = "SELECT c FROM CatalogoEntity c WHERE c.fecReg = :fecReg")
//    , @NamedQuery(name = "CatalogoEntity.findByUsuModif", query = "SELECT c FROM CatalogoEntity c WHERE c.usuModif = :usuModif")
//    , @NamedQuery(name = "CatalogoEntity.findByFecModif", query = "SELECT c FROM CatalogoEntity c WHERE c.fecModif = :fecModif")})
public class CatalogoEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2962175660684147620L;

	@EmbeddedId
    protected CatalogoEntityPK catalogoEntityPK;
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tipo")
    private Character tipo;
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

    public CatalogoEntity() {
    }

    public CatalogoEntity(CatalogoEntityPK catalogoEntityPK) {
        this.catalogoEntityPK = catalogoEntityPK;
    }

    public CatalogoEntity(String paramCatalogo, String paramCatalogoElemento) {
        this.catalogoEntityPK = new CatalogoEntityPK(paramCatalogo, paramCatalogoElemento);
    }

    public CatalogoEntityPK getCatalogoEntityPK() {
        return catalogoEntityPK;
    }

    public void setCatalogoEntityPK(CatalogoEntityPK catalogoEntityPK) {
        this.catalogoEntityPK = catalogoEntityPK;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catalogoEntityPK != null ? catalogoEntityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEntity)) {
            return false;
        }
        CatalogoEntity other = (CatalogoEntity) object;
        if ((this.catalogoEntityPK == null && other.catalogoEntityPK != null) || (this.catalogoEntityPK != null && !this.catalogoEntityPK.equals(other.catalogoEntityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.CatalogoEntity[ catalogoEntityPK=" + catalogoEntityPK + " ]";
    }
    
}
