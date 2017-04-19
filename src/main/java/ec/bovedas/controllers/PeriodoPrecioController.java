package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.PeriodoPrecio;

public interface PeriodoPrecioController {

	public void guardar(PeriodoPrecio entity, Boolean nuevo);

	public void eliminar(PeriodoPrecio entity);

	public PeriodoPrecio buscar(Integer id);

	public PeriodoPrecio buscar(String usuario, String clave);

	public List<PeriodoPrecio> listarTodo();

	public Integer contar();

}
