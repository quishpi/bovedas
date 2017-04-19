package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.FacturaCabecera;

public interface FacturaCabeceraController {

	public void guardar(FacturaCabecera entity, Boolean nuevo);

	public void eliminar(FacturaCabecera entity);

	public FacturaCabecera buscar(Integer id);

	public FacturaCabecera buscar(String usuario, String clave);

	public List<FacturaCabecera> listarTodo();

	public Integer contar();

}
