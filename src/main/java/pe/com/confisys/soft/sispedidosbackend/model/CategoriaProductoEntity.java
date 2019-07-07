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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_categoria_producto")
@AttributeOverride(name="id", column=@Column(name="tb_categoria_producto_id"))
@XmlRootElement
@JsonRootName("categoriaProducto")
//@NamedQueries({
//    @NamedQuery(name = "CategoriaProductoEntity.findAll", query = "SELECT c FROM CategoriaProductoEntity c")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByTbCategoriaProductoId", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.tbCategoriaProductoId = :tbCategoriaProductoId")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByNombreCategoria", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.nombreCategoria = :nombreCategoria")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByActivo", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.activo = :activo")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByUsuReg", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.usuReg = :usuReg")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByFecReg", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.fecReg = :fecReg")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByUsuModif", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.usuModif = :usuModif")
//    , @NamedQuery(name = "CategoriaProductoEntity.findByFecModif", query = "SELECT c FROM CategoriaProductoEntity c WHERE c.fecModif = :fecModif")})
public class CategoriaProductoEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8570597171072844881L;

	//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_categoria_producto_id")
//    private Integer id;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    @OneToMany(mappedBy = "tbCategoriaProductoIdPadre")
    private List<CategoriaProductoEntity> categoriaProductoEntityList;
    @JoinColumn(name = "tb_categoria_producto_id_padre", referencedColumnName = "tb_categoria_producto_id")
    @ManyToOne
    private CategoriaProductoEntity tbCategoriaProductoIdPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCategoriaProductoId")
    private List<ProductoEntity> productoEntityList;

    public CategoriaProductoEntity() {
    }

    public CategoriaProductoEntity(Integer tbCategoriaProductoId) {
        this.id = tbCategoriaProductoId;
    }

    public Integer getTbCategoriaProductoId() {
        return id;
    }

    public void setTbCategoriaProductoId(Integer tbCategoriaProductoId) {
        this.id = tbCategoriaProductoId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @XmlTransient
    public List<CategoriaProductoEntity> getCategoriaProductoEntityList() {
        return categoriaProductoEntityList;
    }

    public void setCategoriaProductoEntityList(List<CategoriaProductoEntity> categoriaProductoEntityList) {
        this.categoriaProductoEntityList = categoriaProductoEntityList;
    }

    public CategoriaProductoEntity getTbCategoriaProductoIdPadre() {
        return tbCategoriaProductoIdPadre;
    }

    public void setTbCategoriaProductoIdPadre(CategoriaProductoEntity tbCategoriaProductoIdPadre) {
        this.tbCategoriaProductoIdPadre = tbCategoriaProductoIdPadre;
    }

    @XmlTransient
    public List<ProductoEntity> getProductoEntityList() {
        return productoEntityList;
    }

    public void setProductoEntityList(List<ProductoEntity> productoEntityList) {
        this.productoEntityList = productoEntityList;
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
        if (!(object instanceof CategoriaProductoEntity)) {
            return false;
        }
        CategoriaProductoEntity other = (CategoriaProductoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.CategoriaProductoEntity[ tbCategoriaProductoId=" + id + " ]";
    }
    
}
