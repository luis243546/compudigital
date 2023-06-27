package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="cliente")
@Entity(name="Cliente")
public class Cliente {

	@Id
	String dni;
	String nombres;
	String direccion;
	
	public Cliente () {}

	public Cliente(String dni, String nombres, String direccion) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	
	List<Compra>compra;

	public List<Compra> getCompra() {
		return compra;
	}

	public void setCompra(List<Compra> compra) {
		this.compra = compra;
	}
	
}
