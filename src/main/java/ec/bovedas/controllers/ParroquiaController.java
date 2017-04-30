package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Parroquia;


public interface ParroquiaController {

	public String guardar(Parroquia entity, Boolean esNuevo);

	public String eliminar(Parroquia entity);

	public Parroquia buscar(Integer id);

	public List<Parroquia> listarTodo();
	
	public List<Parroquia> listar(Canton canton);

	public Integer contar();

}
