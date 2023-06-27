package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository b;
	
	@Override
	public Producto registrar(Producto producto) {
		// TODO Auto-generated method stub
		return b.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return b.save(producto);
	}

	@Override
	public void eliminar(Producto producto) {
		// TODO Auto-generated method stub
		b.delete(producto);
	}

	@Override
	public List<Producto> ver() {
		// TODO Auto-generated method stub
		return b.findAll();
	}

}
