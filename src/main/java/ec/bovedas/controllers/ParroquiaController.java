package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Parroquia;

public interface ParroquiaController {

	public String guardar(Parroquia entity, Boolean esNuevo);

	public String eliminar(Parroquia entity);

	public Parroquia buscar(Integer id);

	public List<Parroquia> listarTodo();

	public Integer contar();

}
