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

import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService x;
	
	@GetMapping
	public List<Cliente>ver(){
		return x.ver();
	}
	
	
	@PostMapping
	public Cliente registrar(@RequestBody Cliente cliente) {
		return x.registrar(cliente);
	}
	
	@PutMapping
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return x.actualizar(cliente);
	}
	
	
	@DeleteMapping
	public void eliminar(@RequestBody Cliente cliente) {
		x.eliminar(cliente);
	}
	
}
