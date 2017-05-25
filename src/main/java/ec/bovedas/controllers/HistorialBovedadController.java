package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.HistorialBoveda;

public interface HistorialBovedadController {

	public String guardar(HistorialBoveda entity, Boolean nuevo);

	public String eliminar(HistorialBoveda entity);

	public HistorialBoveda buscar(Integer id);

	public HistorialBoveda buscar(String usuario, String clave);

	public List<HistorialBoveda> listarTodo();

	public Integer contar();

}
