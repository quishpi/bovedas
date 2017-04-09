package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Usuario;

public interface UsuarioController {

	public void guardar(Usuario entity, Boolean nuevo);

	public void eliminar(Usuario entity);

	public Usuario buscar(Integer id);

	public Usuario buscar(String usuario, String clave);

	public List<Usuario> listarTodo();

	public Integer contar();
}
