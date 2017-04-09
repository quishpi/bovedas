package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.entities.Usuario;

@ManagedBean
public class CreateUsuarioBean {

	private static final Logger LOGGER = Logger
			.getLogger(CreateUsuarioBean.class);

	private Usuario usuario;

	@EJB
	private UsuarioController usuarioController;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}

	public String process() {
		LOGGER.info("Init: process of CreateUsuarioBean");
		usuarioController.guardar(usuario, true);
		LOGGER.info("Final: process CreateUsuarioBean");
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}