package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.HistorialBoveda;

public interface HistorialBovedadController {

	public void guardar(HistorialBoveda entity, Boolean nuevo);

	public void eliminar(HistorialBoveda entity);

	public HistorialBoveda buscar(Integer id);

	public HistorialBoveda buscar(String usuario, String clave);

	public List<HistorialBoveda> listarTodo();

	public Integer contar();

}
