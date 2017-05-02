package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.entities.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioIndexBean {

	private List<Usuario> usuarios;

	@EJB
	private UsuarioController usuarioController;

	@PostConstruct
	public void update() {
		usuarios = usuarioController.listarTodo();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
