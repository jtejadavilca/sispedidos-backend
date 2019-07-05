/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.confisys.soft.sispedidosbackend.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author USER
 */
@Embeddable
public class CatalogoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "param_catalogo")
    private String paramCatalogo;
    @Basic(optional = false)
    @Column(name = "param_catalogo_elemento")
    private String paramCatalogoElemento;

    public CatalogoPK() {
    }

    public CatalogoPK(String paramCatalogo, String paramCatalogoElemento) {
        this.paramCatalogo = paramCatalogo;
        this.paramCatalogoElemento = paramCatalogoElemento;
    }

    public String getParamCatalogo() {
        return paramCatalogo;
    }

    public void setParamCatalogo(String paramCatalogo) {
        this.paramCatalogo = paramCatalogo;
    }

    public String getParamCatalogoElemento() {
        return paramCatalogoElemento;
    }

    public void setParamCatalogoElemento(String paramCatalogoElemento) {
        this.paramCatalogoElemento = paramCatalogoElemento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paramCatalogo != null ? paramCatalogo.hashCode() : 0);
        hash += (paramCatalogoElemento != null ? paramCatalogoElemento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPK)) {
            return false;
        }
        CatalogoPK other = (CatalogoPK) object;
        if ((this.paramCatalogo == null && other.paramCatalogo != null) || (this.paramCatalogo != null && !this.paramCatalogo.equals(other.paramCatalogo))) {
            return false;
        }
        if ((this.paramCatalogoElemento == null && other.paramCatalogoElemento != null) || (this.paramCatalogoElemento != null && !this.paramCatalogoElemento.equals(other.paramCatalogoElemento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.CatalogoPK[ paramCatalogo=" + paramCatalogo + ", paramCatalogoElemento=" + paramCatalogoElemento + " ]";
    }
    
}
