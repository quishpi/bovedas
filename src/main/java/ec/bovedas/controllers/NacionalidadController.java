package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Nacionalidad;

public interface NacionalidadController {

	public void guardar(Nacionalidad entity, Boolean nuevo);

	public void eliminar(Nacionalidad entity);

	public Nacionalidad buscar(Integer id);

	public Nacionalidad buscar(String usuario, String clave);

	public List<Nacionalidad> listarTodo();

	public Integer contar();

}
