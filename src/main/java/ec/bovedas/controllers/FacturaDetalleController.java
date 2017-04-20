package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.FacturaDetalle;

public interface FacturaDetalleController {

	public void guardar(FacturaDetalle entity, Boolean nuevo);

	public void eliminar(FacturaDetalle entity);

	public FacturaDetalle buscar(Integer id);

	public FacturaDetalle buscar(String usuario, String clave);

	public List<FacturaDetalle> listarTodo();

	public Integer contar();

}
