package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Boveda;

public interface BovedaController {
	public void guardar(Boveda entity, Boolean nuevo);

	public void eliminar(Boveda entity);

	public Boveda buscar(Integer id);

	public Boveda buscar(String usuario, String clave);

	public List<Boveda> listarTodo();

	public Integer contar();

}
