package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.BovedaController;
import ec.bovedas.models.entities.Boveda;
import ec.bovedas.utils.Estado;
import ec.bovedas.utils.EstadoFisico;
import ec.bovedas.utils.Mensajes;
import ec.bovedas.utils.TipoBoveda;

@ManagedBean
@ViewScoped
public class BovedaCreateBean {

	private static final Logger LOGGER = Logger.getLogger(BovedaCreateBean.class);

	private Boveda boveda;

	@EJB
	private BovedaController bovedaController;

	@PostConstruct
	public void init() {
		boveda = new Boveda();

	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = bovedaController.guardar(boveda, true);
		if (result == null) {
			boveda = new Boveda();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}

	public EstadoFisico[] getEstadoFisicos() {
		return EstadoFisico.values();
	}

	public Estado[] getEstados() {
		return Estado.values();
	}

	public TipoBoveda[] getTipoBovedas() {
		return TipoBoveda.values();
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Boveda getBoveda() {
		return boveda;
	}

	public void setBoveda(Boveda boveda) {
		this.boveda = boveda;
	}

}
