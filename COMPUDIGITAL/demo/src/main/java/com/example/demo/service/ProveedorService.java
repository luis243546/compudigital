package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Proveedor;

public interface ProveedorService {

	public Proveedor registrar(Proveedor proveedor);
	public Proveedor actualizar(Proveedor proveedor);
	public void eliminar(Proveedor proveedor);
	
	public List<Proveedor>ver();
}

