package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.PeriodoPrecio;

public interface PeriodoPrecioController {

	public String guardar(PeriodoPrecio entity, Boolean nuevo);

	public String eliminar(PeriodoPrecio entity);

	public PeriodoPrecio buscar(Integer id);

	public PeriodoPrecio buscar(String usuario, String clave);

	public List<PeriodoPrecio> listarTodo();

	public Integer contar();

}
