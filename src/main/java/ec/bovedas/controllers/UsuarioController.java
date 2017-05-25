package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Usuario;

public interface UsuarioController {

	public String guardar(Usuario entity, Boolean esNuevo);

	public String eliminar(Usuario entity);

	public Usuario buscar(Integer id);

	public Usuario buscar(String cedula);

	public List<Usuario> listarTodo();

	public Integer contar();
}
