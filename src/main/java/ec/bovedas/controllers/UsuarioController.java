package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Usuario;

public interface UsuarioController {

	public void guardar(Usuario entity, Boolean esNuevo);

	public void eliminar(Usuario entity);

	public Usuario buscar(Integer id);

	public Usuario buscar(String cedula, String clave);

	public List<Usuario> listarTodo();

	public Integer contar();
}
