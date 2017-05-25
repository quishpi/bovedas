package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;
import ec.bovedas.controllers.PeriodoPrecioController;
import ec.bovedas.models.entities.PeriodoPrecio;
import ec.bovedas.utils.EstadoPrecio;
import ec.bovedas.utils.Mensajes;
import ec.bovedas.utils.TipoBoveda;

@ManagedBean
@ViewScoped
public class PeriodoPrecioCreateBean {

	private static final Logger LOGGER = Logger.getLogger(PeriodoPrecioCreateBean.class);

	private PeriodoPrecio periodoPrecio;

	@EJB
	private PeriodoPrecioController periodoPrecioController;

	@PostConstruct
	public void init() {
		periodoPrecio = new PeriodoPrecio();
	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = periodoPrecioController.guardar(periodoPrecio, true);
		if (result == null) {
			periodoPrecio = new PeriodoPrecio();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}

	public TipoBoveda[] getTipoBovedas() {
		return TipoBoveda.values();
	}

	public EstadoPrecio[] getEstados() {
		return EstadoPrecio.values();
	}

	public PeriodoPrecio getPeriodoPrecio() {
		return periodoPrecio;
	}

	public void setPeriodoPrecio(PeriodoPrecio periodoPrecio) {
		this.periodoPrecio = periodoPrecio;
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

}
