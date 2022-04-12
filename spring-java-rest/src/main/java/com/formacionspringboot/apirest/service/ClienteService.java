package com.formacionspringboot.apirest.service;

import java.util.List;

import com.formacionspringboot.apirest.entity.Cliente;
import com.formacionspringboot.apirest.entity.Region;

public interface ClienteService {

	public List<Cliente> mostrarTodo();
	
	public Cliente buscarPorId(long id);
	
	public Cliente guardar(Cliente cliente);
	
	public void borrar(long id);
	
	public List<Region> buscarTodasLasRegiones();
	
	public List<Cliente> buscarPorApellido(String apellido);
}
