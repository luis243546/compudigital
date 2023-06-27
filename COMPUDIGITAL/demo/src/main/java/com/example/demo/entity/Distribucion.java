package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name="distribucion")
@Entity(name="Distribucion")
public class Distribucion {

	@Id
	String cod_distribucion;
	String f_distribucion;
	String n_pedido;
	int cantidad;
	double costo;
	
	public Distribucion() {}

	public Distribucion(String cod_distribucion, String f_distribucion, String n_pedido, int cantidad, double costo) {
		super();
		this.cod_distribucion = cod_distribucion;
		this.f_distribucion = f_distribucion;
		this.n_pedido = n_pedido;
		this.cantidad = cantidad;
		this.costo = costo;
	}

	public String getCod_distribucion() {
		return cod_distribucion;
	}

	public void setCod_distribucion(String cod_distribucion) {
		this.cod_distribucion = cod_distribucion;
	}

	public String getF_distribucion() {
		return f_distribucion;
	}

	public void setF_distribucion(String f_distribucion) {
		this.f_distribucion = f_distribucion;
	}

	public String getN_pedido() {
		return n_pedido;
	}

	public void setN_pedido(String n_pedido) {
		this.n_pedido = n_pedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cod_producto")
	
	private Producto producto;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ruc")
	
	
	private Proveedor proveedor;

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
}
