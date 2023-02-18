package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")

@NamedNativeQuery(name = "Item.consultarBarras", query = "select *from item i where i.item_codigo_barras=:datoBarras", resultClass = Item.class)


public class Item {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
	@SequenceGenerator(name = "item_seq", sequenceName = "item_seq", allocationSize = 1)
	@Column(name = "item_id")
	private Integer id;
	
	@Column(name = "item_codigo_barras")
	private String codigoBarras;
	
	@Column(name = "item_nombre")
	private String nombre;
	
	@Column(name = "item_tipo")
	private String tipo;
	
	@Column(name = "item_stock")
	private Integer stock;
	
	@Column(name = "item_precio")
	private BigDecimal precioU;
	
	@OneToMany(mappedBy = "item", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<DetalleFactura> detalleFactura;

	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecioU() {
		return precioU;
	}

	public void setPrecioU(BigDecimal precioU) {
		this.precioU = precioU;
	}

	public List<DetalleFactura> getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	
	//to string

	@Override
	public String toString() {
		return "Item [id=" + id + ", codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", tipo=" + tipo
				+ ", stock=" + stock + ", precioU=" + precioU + ", detalleFactura=" + detalleFactura + "]";
	}
	
	
	
}


