package ec.bovedas.controllers;

import java.util.List;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Provincia;

public interface CantonController {

	public String guardar(Canton entity, Boolean esNuevo);

	public String eliminar(Canton entity);

	public Canton buscar(Integer id);

	public List<Canton> listarTodo();

	public List<Canton> listar(Provincia provincia);

	public Integer contar();

}
