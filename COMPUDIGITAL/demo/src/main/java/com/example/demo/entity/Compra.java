package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="compra")
@Entity(name="Compra")
public class Compra {

	@Id
	String cod_compra;
	String n_pedido;
	String f_compra;
	int cant_compra;
	double costo_total;
	
	public Compra() {}

	public Compra(String cod_compra, String n_pedido, String f_compra, int cant_compra, double costo_total) {
		super();
		this.cod_compra = cod_compra;
		this.n_pedido = n_pedido;
		this.f_compra = f_compra;
		this.cant_compra = cant_compra;
		this.costo_total = costo_total;
	}

	public String getCod_compra() {
		return cod_compra;
	}

	public void setCod_compra(String cod_compra) {
		this.cod_compra = cod_compra;
	}

	public String getN_pedido() {
		return n_pedido;
	}

	public void setN_pedido(String n_pedido) {
		this.n_pedido = n_pedido;
	}

	public String getF_compra() {
		return f_compra;
	}

	public void setF_compra(String f_compra) {
		this.f_compra = f_compra;
	}

	public int getCant_compra() {
		return cant_compra;
	}

	public void setCant_compra(int cant_compra) {
		this.cant_compra = cant_compra;
	}

	public double getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(double costo_total) {
		this.costo_total = costo_total;
	}
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dni")
	
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	
	
	
}
