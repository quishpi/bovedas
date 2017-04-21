package ec.bovedas.controllers;

import java.util.List;

import ec.bovedas.models.entities.Mausoleo;

public interface MausoleoController {

	public void guardar(Mausoleo entity, Boolean nuevo);

	public void eliminar(Mausoleo entity);

	public Mausoleo buscar(Integer id);

	public Mausoleo buscar(String usuario, String clave);

	public List<Mausoleo> listarTodo();

	public Integer contar();

}