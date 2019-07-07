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
import javax.persistence.Lob;
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
@Table(name = "tb_producto")
@AttributeOverride(name="id", column=@Column(name="tb_producto_id"))
@XmlRootElement
@JsonRootName("producto")
//@NamedQueries({
//    @NamedQuery(name = "ProductoEntity.findAll", query = "SELECT p FROM ProductoEntity p")
//    , @NamedQuery(name = "ProductoEntity.findByTbProductoId", query = "SELECT p FROM ProductoEntity p WHERE p.tbProductoId = :tbProductoId")
//    , @NamedQuery(name = "ProductoEntity.findByCodigo", query = "SELECT p FROM ProductoEntity p WHERE p.codigo = :codigo")
//    , @NamedQuery(name = "ProductoEntity.findByCodMarca", query = "SELECT p FROM ProductoEntity p WHERE p.codMarca = :codMarca")
//    , @NamedQuery(name = "ProductoEntity.findByCodModelo", query = "SELECT p FROM ProductoEntity p WHERE p.codModelo = :codModelo")
//    , @NamedQuery(name = "ProductoEntity.findByNumeroSerie", query = "SELECT p FROM ProductoEntity p WHERE p.numeroSerie = :numeroSerie")
//    , @NamedQuery(name = "ProductoEntity.findByDescripcion", query = "SELECT p FROM ProductoEntity p WHERE p.descripcion = :descripcion")
//    , @NamedQuery(name = "ProductoEntity.findByLote", query = "SELECT p FROM ProductoEntity p WHERE p.lote = :lote")
//    , @NamedQuery(name = "ProductoEntity.findByTamanho", query = "SELECT p FROM ProductoEntity p WHERE p.tamanho = :tamanho")
//    , @NamedQuery(name = "ProductoEntity.findByColor", query = "SELECT p FROM ProductoEntity p WHERE p.color = :color")
//    , @NamedQuery(name = "ProductoEntity.findByPrecioVenta", query = "SELECT p FROM ProductoEntity p WHERE p.precioVenta = :precioVenta")
//    , @NamedQuery(name = "ProductoEntity.findByPrecioCompra", query = "SELECT p FROM ProductoEntity p WHERE p.precioCompra = :precioCompra")
//    , @NamedQuery(name = "ProductoEntity.findByActivo", query = "SELECT p FROM ProductoEntity p WHERE p.activo = :activo")
//    , @NamedQuery(name = "ProductoEntity.findByUsuReg", query = "SELECT p FROM ProductoEntity p WHERE p.usuReg = :usuReg")
//    , @NamedQuery(name = "ProductoEntity.findByFecReg", query = "SELECT p FROM ProductoEntity p WHERE p.fecReg = :fecReg")
//    , @NamedQuery(name = "ProductoEntity.findByUsuModif", query = "SELECT p FROM ProductoEntity p WHERE p.usuModif = :usuModif")
//    , @NamedQuery(name = "ProductoEntity.findByFecModif", query = "SELECT p FROM ProductoEntity p WHERE p.fecModif = :fecModif")})
public class ProductoEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "tb_producto_id")
//    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "cod_marca")
    private String codMarca;
    @Column(name = "cod_modelo")
    private String codModelo;
    @Column(name = "numero_serie")
    private String numeroSerie;
    @Column(name = "descripcion")
    private String descripcion;
    @Lob
    @Column(name = "stock")
    private String stock;
    @Column(name = "lote")
    private String lote;
    @Column(name = "tamanho")
    private String tamanho;
    @Column(name = "color")
    private String color;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_venta")
    private Float precioVenta;
    @Column(name = "precio_compra")
    private Float precioCompra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbProductoId")
    private List<PedidoDetalleEntity> pedidoDetalleEntityList;
    @JoinColumn(name = "tb_categoria_producto_id", referencedColumnName = "tb_categoria_producto_id")
    @ManyToOne(optional = false)
    private CategoriaProductoEntity tbCategoriaProductoId;

    public ProductoEntity() {
    }

    public ProductoEntity(Integer tbProductoId) {
        this.id = tbProductoId;
    }

    public Integer getTbProductoId() {
        return id;
    }

    public void setTbProductoId(Integer tbProductoId) {
        this.id = tbProductoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(String codMarca) {
        this.codMarca = codMarca;
    }

    public String getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(String codModelo) {
        this.codModelo = codModelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    @XmlTransient
    public List<PedidoDetalleEntity> getPedidoDetalleEntityList() {
        return pedidoDetalleEntityList;
    }

    public void setPedidoDetalleEntityList(List<PedidoDetalleEntity> pedidoDetalleEntityList) {
        this.pedidoDetalleEntityList = pedidoDetalleEntityList;
    }

    public CategoriaProductoEntity getTbCategoriaProductoId() {
        return tbCategoriaProductoId;
    }

    public void setTbCategoriaProductoId(CategoriaProductoEntity tbCategoriaProductoId) {
        this.tbCategoriaProductoId = tbCategoriaProductoId;
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
        if (!(object instanceof ProductoEntity)) {
            return false;
        }
        ProductoEntity other = (ProductoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.ProductoEntity[ tbProductoId=" + id + " ]";
    }
    
}
