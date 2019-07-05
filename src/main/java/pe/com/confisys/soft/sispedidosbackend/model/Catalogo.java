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
@Table(name = "tb_catalogo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogo.findAll", query = "SELECT c FROM Catalogo c")
    , @NamedQuery(name = "Catalogo.findByParamCatalogo", query = "SELECT c FROM Catalogo c WHERE c.catalogoPK.paramCatalogo = :paramCatalogo")
    , @NamedQuery(name = "Catalogo.findByParamCatalogoElemento", query = "SELECT c FROM Catalogo c WHERE c.catalogoPK.paramCatalogoElemento = :paramCatalogoElemento")
    , @NamedQuery(name = "Catalogo.findByDescripcionCorta", query = "SELECT c FROM Catalogo c WHERE c.descripcionCorta = :descripcionCorta")
    , @NamedQuery(name = "Catalogo.findByTipo", query = "SELECT c FROM Catalogo c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Catalogo.findByActivo", query = "SELECT c FROM Catalogo c WHERE c.activo = :activo")
    , @NamedQuery(name = "Catalogo.findByUsuReg", query = "SELECT c FROM Catalogo c WHERE c.usuReg = :usuReg")
    , @NamedQuery(name = "Catalogo.findByFecReg", query = "SELECT c FROM Catalogo c WHERE c.fecReg = :fecReg")
    , @NamedQuery(name = "Catalogo.findByUsuModif", query = "SELECT c FROM Catalogo c WHERE c.usuModif = :usuModif")
    , @NamedQuery(name = "Catalogo.findByFecModif", query = "SELECT c FROM Catalogo c WHERE c.fecModif = :fecModif")})
public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CatalogoPK catalogoPK;
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Lob
    @Column(name = "descricpcion")
    private String descricpcion;
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

    public Catalogo() {
    }

    public Catalogo(CatalogoPK catalogoPK) {
        this.catalogoPK = catalogoPK;
    }

    public Catalogo(String paramCatalogo, String paramCatalogoElemento) {
        this.catalogoPK = new CatalogoPK(paramCatalogo, paramCatalogoElemento);
    }

    public CatalogoPK getCatalogoPK() {
        return catalogoPK;
    }

    public void setCatalogoPK(CatalogoPK catalogoPK) {
        this.catalogoPK = catalogoPK;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescricpcion() {
        return descricpcion;
    }

    public void setDescricpcion(String descricpcion) {
        this.descricpcion = descricpcion;
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
        hash += (catalogoPK != null ? catalogoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.catalogoPK == null && other.catalogoPK != null) || (this.catalogoPK != null && !this.catalogoPK.equals(other.catalogoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Catalogo[ catalogoPK=" + catalogoPK + " ]";
    }
    
}
