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
@Table(name = "tb_categoria_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaProducto.findAll", query = "SELECT c FROM CategoriaProducto c")
    , @NamedQuery(name = "CategoriaProducto.findByTbCategoriaProductoId", query = "SELECT c FROM CategoriaProducto c WHERE c.tbCategoriaProductoId = :tbCategoriaProductoId")
    , @NamedQuery(name = "CategoriaProducto.findByNombreCategoria", query = "SELECT c FROM CategoriaProducto c WHERE c.nombreCategoria = :nombreCategoria")
    , @NamedQuery(name = "CategoriaProducto.findByActivo", query = "SELECT c FROM CategoriaProducto c WHERE c.activo = :activo")
    , @NamedQuery(name = "CategoriaProducto.findByUsuReg", query = "SELECT c FROM CategoriaProducto c WHERE c.usuReg = :usuReg")
    , @NamedQuery(name = "CategoriaProducto.findByFecReg", query = "SELECT c FROM CategoriaProducto c WHERE c.fecReg = :fecReg")
    , @NamedQuery(name = "CategoriaProducto.findByUsuModif", query = "SELECT c FROM CategoriaProducto c WHERE c.usuModif = :usuModif")
    , @NamedQuery(name = "CategoriaProducto.findByFecModif", query = "SELECT c FROM CategoriaProducto c WHERE c.fecModif = :fecModif")})
public class CategoriaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_categoria_producto_id")
    private Integer tbCategoriaProductoId;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
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
    @OneToMany(mappedBy = "tbCategoriaProductoIdPadre")
    private List<CategoriaProducto> categoriaProductoList;
    @JoinColumn(name = "tb_categoria_producto_id_padre", referencedColumnName = "tb_categoria_producto_id")
    @ManyToOne
    private CategoriaProducto tbCategoriaProductoIdPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCategoriaProductoId")
    private List<Producto> productoList;

    public CategoriaProducto() {
    }

    public CategoriaProducto(Integer tbCategoriaProductoId) {
        this.tbCategoriaProductoId = tbCategoriaProductoId;
    }

    public Integer getTbCategoriaProductoId() {
        return tbCategoriaProductoId;
    }

    public void setTbCategoriaProductoId(Integer tbCategoriaProductoId) {
        this.tbCategoriaProductoId = tbCategoriaProductoId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
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
    public List<CategoriaProducto> getCategoriaProductoList() {
        return categoriaProductoList;
    }

    public void setCategoriaProductoList(List<CategoriaProducto> categoriaProductoList) {
        this.categoriaProductoList = categoriaProductoList;
    }

    public CategoriaProducto getTbCategoriaProductoIdPadre() {
        return tbCategoriaProductoIdPadre;
    }

    public void setTbCategoriaProductoIdPadre(CategoriaProducto tbCategoriaProductoIdPadre) {
        this.tbCategoriaProductoIdPadre = tbCategoriaProductoIdPadre;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbCategoriaProductoId != null ? tbCategoriaProductoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProducto)) {
            return false;
        }
        CategoriaProducto other = (CategoriaProducto) object;
        if ((this.tbCategoriaProductoId == null && other.tbCategoriaProductoId != null) || (this.tbCategoriaProductoId != null && !this.tbCategoriaProductoId.equals(other.tbCategoriaProductoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.CategoriaProducto[ tbCategoriaProductoId=" + tbCategoriaProductoId + " ]";
    }
    
}
