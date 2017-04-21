package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Nacionalidad;

public interface NacionalidadController {

	public String guardar(Nacionalidad entity, Boolean nuevo);

	public String eliminar(Nacionalidad entity);

	public Nacionalidad buscar(Integer id);

	public Nacionalidad buscar(String usuario, String clave);

	public List<Nacionalidad> listarTodo();

	public Integer contar();

}
