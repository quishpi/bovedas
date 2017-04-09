package ec.bovedas.views.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.entities.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioListBean {

	private static final Logger LOGGER = Logger.getLogger(UsuarioCreateBean.class);

	private List<Usuario> usuarios;

	@EJB
	private UsuarioController usuarioController;

	@PostConstruct
	public void update() {
		LOGGER.info("Init: process of CreateUsuarioBean");
		usuarios = usuarioController.listarTodo();
		LOGGER.info("Finish: process of CreateUsuarioBean");

	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
