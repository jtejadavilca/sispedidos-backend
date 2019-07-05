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
import javax.persistence.Lob;
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
@Table(name = "tb_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByTbProductoId", query = "SELECT p FROM Producto p WHERE p.tbProductoId = :tbProductoId")
    , @NamedQuery(name = "Producto.findByCodigo", query = "SELECT p FROM Producto p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Producto.findByCodMarca", query = "SELECT p FROM Producto p WHERE p.codMarca = :codMarca")
    , @NamedQuery(name = "Producto.findByCodModelo", query = "SELECT p FROM Producto p WHERE p.codModelo = :codModelo")
    , @NamedQuery(name = "Producto.findByNumeroSerie", query = "SELECT p FROM Producto p WHERE p.numeroSerie = :numeroSerie")
    , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Producto.findByLote", query = "SELECT p FROM Producto p WHERE p.lote = :lote")
    , @NamedQuery(name = "Producto.findByTamanho", query = "SELECT p FROM Producto p WHERE p.tamanho = :tamanho")
    , @NamedQuery(name = "Producto.findByColor", query = "SELECT p FROM Producto p WHERE p.color = :color")
    , @NamedQuery(name = "Producto.findByPrecioVenta", query = "SELECT p FROM Producto p WHERE p.precioVenta = :precioVenta")
    , @NamedQuery(name = "Producto.findByPrecioCompra", query = "SELECT p FROM Producto p WHERE p.precioCompra = :precioCompra")
    , @NamedQuery(name = "Producto.findByActivo", query = "SELECT p FROM Producto p WHERE p.activo = :activo")
    , @NamedQuery(name = "Producto.findByUsuReg", query = "SELECT p FROM Producto p WHERE p.usuReg = :usuReg")
    , @NamedQuery(name = "Producto.findByFecReg", query = "SELECT p FROM Producto p WHERE p.fecReg = :fecReg")
    , @NamedQuery(name = "Producto.findByUsuModif", query = "SELECT p FROM Producto p WHERE p.usuModif = :usuModif")
    , @NamedQuery(name = "Producto.findByFecModif", query = "SELECT p FROM Producto p WHERE p.fecModif = :fecModif")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tb_producto_id")
    private Integer tbProductoId;
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
    private String fecModif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbProductoId")
    private List<PedidoDetalle> pedidoDetalleList;
    @JoinColumn(name = "tb_categoria_producto_id", referencedColumnName = "tb_categoria_producto_id")
    @ManyToOne(optional = false)
    private CategoriaProducto tbCategoriaProductoId;

    public Producto() {
    }

    public Producto(Integer tbProductoId) {
        this.tbProductoId = tbProductoId;
    }

    public Integer getTbProductoId() {
        return tbProductoId;
    }

    public void setTbProductoId(Integer tbProductoId) {
        this.tbProductoId = tbProductoId;
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

    public String getFecModif() {
        return fecModif;
    }

    public void setFecModif(String fecModif) {
        this.fecModif = fecModif;
    }

    @XmlTransient
    public List<PedidoDetalle> getPedidoDetalleList() {
        return pedidoDetalleList;
    }

    public void setPedidoDetalleList(List<PedidoDetalle> pedidoDetalleList) {
        this.pedidoDetalleList = pedidoDetalleList;
    }

    public CategoriaProducto getTbCategoriaProductoId() {
        return tbCategoriaProductoId;
    }

    public void setTbCategoriaProductoId(CategoriaProducto tbCategoriaProductoId) {
        this.tbCategoriaProductoId = tbCategoriaProductoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbProductoId != null ? tbProductoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.tbProductoId == null && other.tbProductoId != null) || (this.tbProductoId != null && !this.tbProductoId.equals(other.tbProductoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.confisys.soft.sispedidosbackend.model.Producto[ tbProductoId=" + tbProductoId + " ]";
    }
    
}
