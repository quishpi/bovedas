package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.EmpresaController;
import ec.bovedas.controllers.UsuarioController;
import ec.bovedas.models.entities.Empresa;
import ec.bovedas.models.entities.Usuario;
import ec.bovedas.utils.Encrypt;
import ec.bovedas.utils.Mensajes;
import ec.bovedas.utils.UsuarioTipo;
import ec.bovedas.utils.Utils;

@ManagedBean
@ViewScoped
public class InstalacionBean {

	private Usuario usuario;
	private Empresa empresa;
	private String clave;

	@EJB
	private UsuarioController usuarioController;
	@EJB
	private EmpresaController empresaController;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
		empresa = new Empresa();
		Integer contarEmpresa = empresaController.contar();
		Integer contarUsuarios = usuarioController.contar();
		if (contarEmpresa > 0 || contarUsuarios > 0) {
			Utils.redirectToPage("/pages/login/index.xhtml");
		}
	}

	public void guardar() {
		usuario.setUsuarioTipo(UsuarioTipo.ADMINISTRADOR);
		usuario.setClave(Encrypt.encriptar(usuario.getClave()));
		String result = usuarioController.guardar(usuario, true);
		if (result == null) {
			result = empresaController.guardar(empresa, true);
			if (result == null) {
				usuario = new Usuario();
				empresa = new Empresa();
				Utils.redirectToPage("/pages/instalacion/exito.xhtml");
			} else {
				usuarioController.eliminar(usuario);
				Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, " Error: " + result);
			}
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, " Error: " + result);
		}

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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
