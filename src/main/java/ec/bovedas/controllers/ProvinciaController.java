package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Provincia;

public interface ProvinciaController {

	public String guardar(Provincia entity, Boolean esNuevo);

	public String eliminar(Provincia entity);

	public Provincia buscar(Integer id);

	public List<Provincia> listarTodo();

	public Integer contar();

}
