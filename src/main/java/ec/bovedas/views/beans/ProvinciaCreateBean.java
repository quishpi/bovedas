package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;
import ec.bovedas.controllers.ProvinciaController;
import ec.bovedas.models.entities.Provincia;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class ProvinciaCreateBean {

	private static final Logger LOGGER = Logger.getLogger(ProvinciaCreateBean.class);

	private Provincia provincia;

	@EJB
	private ProvinciaController provinciaController;

	@PostConstruct
	public void init() {
		provincia = new Provincia();
	}

	public void guardar() {
		LOGGER.info("Init: Guardar");
		String result = provinciaController.guardar(provincia, true);
		if (result == null) {
			provincia = new Provincia();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, " Guardado correctamente ok.");
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
