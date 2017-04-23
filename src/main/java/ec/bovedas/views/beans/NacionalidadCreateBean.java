package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ec.bovedas.controllers.NacionalidadController;
import ec.bovedas.models.entities.Nacionalidad;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class NacionalidadCreateBean {

	private Nacionalidad nacionalidad;

	@EJB
	private NacionalidadController nacionalidadController;

	@PostConstruct
	public void init() {
		nacionalidad = new Nacionalidad();
	}

	public void guardar() {
		String result = nacionalidadController.guardar(nacionalidad, true);
		if (result == null) {
			nacionalidad = new Nacionalidad();
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

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
