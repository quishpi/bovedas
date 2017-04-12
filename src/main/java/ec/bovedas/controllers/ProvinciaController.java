package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Provincia;

public interface ProvinciaController {

	public void guardar(Provincia entity, Boolean nuevo);

	public void eliminar(Provincia entity);

	public Provincia buscar(Integer id);

	public Provincia buscar(String usuario, String clave);

	public List<Provincia> listarTodo();

	public Integer contar();

}
