package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository a;
	
	
	@Override
	public Cliente registrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return a.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return a.save(cliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		a.delete(cliente);
	}

	@Override
	public List<Cliente> ver() {
		// TODO Auto-generated method stub
		return a.findAll();
	}

}
