package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Representante;

public interface RepresentanteController {

	public String guardar(Representante entity, Boolean nuevo);

	public String eliminar(Representante entity);

	public Representante buscar(Integer id);

	public Representante buscar(String usuario, String clave);

	public List<Representante> listarTodo();

	public Integer contar();
	
	public List<Representante> listarRepresentante(String criterio);

}
