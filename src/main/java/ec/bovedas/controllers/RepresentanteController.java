package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Representante;

public interface RepresentanteController {

	public void guardar(Representante entity, Boolean nuevo);

	public void eliminar(Representante entity);

	public Representante buscar(Integer id);

	public Representante buscar(String usuario, String clave);

	public List<Representante> listarTodo();

	public Integer contar();

}
