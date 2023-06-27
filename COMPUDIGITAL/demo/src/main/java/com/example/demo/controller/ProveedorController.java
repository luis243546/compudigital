package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Proveedor;
import com.example.demo.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	ProveedorService z;
	
	@GetMapping("/pro")
	public List<Proveedor>ver(){
		return z.ver();
	}
	
	
	@PostMapping
	public Proveedor registrar(@RequestBody Proveedor proveedor) {
		return z.registrar(proveedor);
	}
	
	
	@PutMapping
	public Proveedor actualizar(@RequestBody Proveedor proveedor) {
		return z.actualizar(proveedor);
	}
	
	
	public void elminar(@RequestBody Proveedor proveedor) {
		z.eliminar(proveedor);
	}
	
}
