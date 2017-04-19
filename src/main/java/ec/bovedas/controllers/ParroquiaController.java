package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Parroquia;

public interface ParroquiaController {

	public void guardar(Parroquia entity, Boolean nuevo);

	public void eliminar(Parroquia entity);

	public Parroquia buscar(Integer id);

	public Parroquia buscar(String usuario, String clave);

	public List<Parroquia> listarTodo();

	public Integer contar();

}
