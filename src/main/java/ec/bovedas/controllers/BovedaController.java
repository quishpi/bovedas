package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Boveda;

public interface BovedaController {
	public String guardar(Boveda entity, Boolean nuevo);

	public String eliminar(Boveda entity);

	public Boveda buscar(Integer id);

	public Boveda buscar(String usuario, String clave);

	public List<Boveda> listarTodo();

	public Integer contar();

}
