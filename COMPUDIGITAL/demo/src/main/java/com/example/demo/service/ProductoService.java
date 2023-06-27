package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductoService {

	public Producto registrar(Producto producto);
	public Producto actualizar(Producto producto);
	public void eliminar(Producto producto);
	
	public List<Producto>ver();
}
