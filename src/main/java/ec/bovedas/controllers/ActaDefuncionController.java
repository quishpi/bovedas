package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.ActaDefuncion;

public interface ActaDefuncionController {

	public void guardar(ActaDefuncion entity, Boolean nuevo);

	public void eliminar(ActaDefuncion entity);

	public ActaDefuncion buscar(Integer id);

	public ActaDefuncion buscar(String usuario, String clave);

	public List<ActaDefuncion> listarTodo();

	public Integer contar();

}
