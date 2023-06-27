package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService y;
	
	@GetMapping
	public List<Producto>ver(){
		return y.ver();
	}
	
	@PostMapping
	public Producto registrar(@RequestBody Producto producto) {
		return y.registrar(producto);
	}
	
	
	@PutMapping
	public Producto actualizar(@RequestBody Producto producto) {
		return y.actualizar(producto);
	}
	
	
	@DeleteMapping
	public void eliminar(@RequestBody Producto producto) {
		y.eliminar(producto);
	}
	
}
