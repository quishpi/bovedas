package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.entities.Usuario;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class UsuarioCreateBean {

	private static final Logger LOGGER = Logger.getLogger(UsuarioCreateBean.class);

	private Usuario usuario;
	private String clave;

	@EJB
	private UsuarioController usuarioController;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}

	public void guardar() {
		LOGGER.info("Init: Guardar");
		String result = usuarioController.guardar(usuario, true);
		if (result == null) {
			usuario = new Usuario();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, " Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, " Error: " + result);
		}
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	

}
