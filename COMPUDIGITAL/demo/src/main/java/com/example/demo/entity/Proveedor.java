package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "proveedor")
@Entity(name = "Proveedor")
public class Proveedor {

	@Id
	@Column(name = "ruc", length = 20, nullable = false, unique = true)
	String ruc;

	@Column(name = "razon_social", length = 60, nullable = false)
	String razon_social;
	@Column(name = "direccion", length = 40, nullable = false)
	String direccion;
	@Column(name = "correo", length = 45, nullable = false, unique = true)
	String correo;

	public Proveedor() {
	}

	public Proveedor(String ruc, String razon_social, String direccion, String correo) {
		super();
		this.ruc = ruc;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.correo = correo;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedor", cascade = CascadeType.ALL)

	List<Distribucion> distribucion;

	public List<Distribucion> getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(List<Distribucion> distribucion) {
		this.distribucion = distribucion;
	}

}
