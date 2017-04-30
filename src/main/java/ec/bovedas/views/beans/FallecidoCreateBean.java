package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.FallecidoController;
import ec.bovedas.models.entities.Fallecido;
import ec.bovedas.utils.EstadoCivil;
import ec.bovedas.utils.Genero;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class FallecidoCreateBean {

	private static final Logger LOGGER = Logger.getLogger(FallecidoCreateBean.class);

	private Fallecido fallecido;

	@EJB
	private FallecidoController fallecidoController;

	@PostConstruct
	public void init() {
		fallecido = new Fallecido();

	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = fallecidoController.guardar(fallecido, true);
		if (result == null) {
			fallecido = new Fallecido();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}

	public Genero[] getGeneros() {
		return Genero.values();
	}

	public EstadoCivil[] getEstadoCiviles() {
		return EstadoCivil.values();
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Fallecido getFallecido() {
		return fallecido;
	}

	public void setFallecido(Fallecido fallecido) {
		this.fallecido = fallecido;
	}

}
