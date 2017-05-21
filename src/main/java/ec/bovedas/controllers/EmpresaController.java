package ec.bovedas.controllers;

import java.util.List;
import ec.bovedas.models.entities.Empresa;


public interface EmpresaController {

	public String guardar(Empresa entity, Boolean esNuevo);

	public String eliminar(Empresa entity);

	public Empresa buscar(Integer id);

	public List<Empresa> listarTodo();	

	public Integer contar();

}
