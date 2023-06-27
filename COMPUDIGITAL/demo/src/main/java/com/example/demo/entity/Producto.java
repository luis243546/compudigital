package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="producto")
@Entity(name="Producto")
public class Producto {

	
	@Id
	String cod_producto;
	String nombre;
	String marca;
	String modelo;
	String color;
	int stock;
	double precio;
	
	public Producto() {}

	public Producto(String cod_producto, String nombre, String marca, String modelo, String color, int stock,
			double precio) {
		super();
		this.cod_producto = cod_producto;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.stock = stock;
		this.precio = precio;
	}

	public String getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="producto", cascade=CascadeType.ALL)
	
	List<Compra>compra;

	public List<Compra> getCompra() {
		return compra;
	}

	public void setCompra(List<Compra> compra) {
		this.compra = compra;
	}
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="producto", cascade=CascadeType.ALL)
	
	List<Distribucion>distribucion;

	public List<Distribucion> getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(List<Distribucion> distribucion) {
		this.distribucion = distribucion;
	}
	
	
	
}
