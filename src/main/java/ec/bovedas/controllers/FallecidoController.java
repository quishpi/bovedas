package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Fallecido;

public interface FallecidoController {

	public void guardar(Fallecido entity, Boolean nuevo);

	public void eliminar(Fallecido entity);

	public Fallecido buscar(Integer id);

	public Fallecido buscar(String usuario, String clave);

	public List<Fallecido> listarTodo();

	public Integer contar();

}
