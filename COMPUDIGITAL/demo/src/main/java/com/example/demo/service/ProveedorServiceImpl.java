package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Proveedor;
import com.example.demo.repository.ProveedorRepository;


@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	ProveedorRepository c;
	
	@Override
	public Proveedor registrar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return c.save(proveedor);
	}

	@Override
	public Proveedor actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return c.save(proveedor);
	}

	@Override
	public void eliminar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		c.delete(proveedor);
	}

	@Override
	public List<Proveedor> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

	
}
