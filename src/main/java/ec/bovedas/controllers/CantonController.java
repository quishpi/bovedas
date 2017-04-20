package ec.bovedas.controllers;

import java.util.List;
import ec.bovedas.models.entities.Canton;


public interface CantonController {

	public void guardar(Canton entity, Boolean nuevo);

	public void eliminar(Canton entity);

	public Canton buscar(Integer id);

	public Canton buscar(String usuario, String clave);

	public List<Canton> listarTodo();

	public Integer contar();

}
