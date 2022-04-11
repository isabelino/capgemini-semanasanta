package com.formacionspringboot.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspringboot.apirest.dao.ClienteDao;
import com.formacionspringboot.apirest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao repositorio;
	
	
	@Override
	@Transactional( readOnly = true)
	public List<Cliente> mostrarTodo() {
		return (List<Cliente>) repositorio.findAll();
	}


	@Override
	@Transactional( readOnly = true)
	public Cliente buscarPorId(long id) {
		return repositorio.findById(id).orElse(null);
	}


	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return repositorio.save(cliente);
	}


	@Override
	@Transactional
	public void borrar(long id) {
		repositorio.deleteById(id);
	}

}
