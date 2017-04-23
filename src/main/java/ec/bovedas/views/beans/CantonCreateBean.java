package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class CantonCreateBean {

	private Canton canton;

	@EJB
	private CantonController cantonController;

	@PostConstruct
	public void init() {
		canton = new Canton();
	}

	public void guardar() {
		String result = cantonController.guardar(canton, true);
		if (result == null) {
			canton = new Canton();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
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

	public Canton getCanton() {
		return canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}

}
