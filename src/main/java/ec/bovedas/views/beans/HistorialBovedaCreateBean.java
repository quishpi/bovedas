package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.bovedas.controllers.HistorialBovedadController;
import ec.bovedas.models.entities.HistorialBoveda;
import ec.bovedas.utils.Estado;
import ec.bovedas.utils.EstadoFisico;
import ec.bovedas.utils.Mensajes;
import ec.bovedas.utils.TipoBoveda;

@ManagedBean
@ViewScoped
public class HistorialBovedaCreateBean {

	private static final Logger LOGGER = Logger.getLogger(HistorialBovedaCreateBean.class);

	private HistorialBoveda historialBoveda;

	@EJB

	private HistorialBovedadController historialBovedaController;

	@PostConstruct
	public void init() {

		historialBoveda = new HistorialBoveda();

	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = historialBovedaController.guardar(historialBoveda, true);
		if (result == null) {
			historialBoveda = new HistorialBoveda();
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

	public HistorialBoveda getHistorialBoveda() {
		return historialBoveda;
	}

	public void setHistorialBoveda(HistorialBoveda historialBoveda) {
		this.historialBoveda = historialBoveda;
	}

}
