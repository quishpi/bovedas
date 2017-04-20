package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Contrato;

public interface ContratoController {
	public void guardar(Contrato entity, Boolean nuevo);

	public void eliminar(Contrato entity);

	public Contrato buscar(Integer id);

	public Contrato buscar(String usuario, String clave);

	public List<Contrato> listarTodo();

	public Integer contar();

}
