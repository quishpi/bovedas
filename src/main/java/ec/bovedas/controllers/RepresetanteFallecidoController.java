package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.RepresentanteFallecido;

public interface RepresetanteFallecidoController {

	public void guardar(RepresentanteFallecido entity, Boolean nuevo);

	public void eliminar(RepresentanteFallecido entity);

	public RepresentanteFallecido buscar(Integer id);

	public RepresentanteFallecido buscar(String usuario, String clave);

	public List<RepresentanteFallecido> listarTodo();

	public Integer contar();

}
