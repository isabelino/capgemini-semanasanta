package com.formacionspringboot.apirest.service;

import java.util.List;

import com.formacionspringboot.apirest.entity.Cliente;

public interface ClienteService {

	public List<Cliente> mostrarTodo();
	
	public Cliente buscarPorId(long id);
	
	public Cliente guardar(Cliente cliente);
	
	public void borrar(long id);
}
