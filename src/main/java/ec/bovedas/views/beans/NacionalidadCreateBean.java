package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.NacionalidadController;
import ec.bovedas.models.entities.Nacionalidad;
import ec.bovedas.utils.MensajesTipo;

@ManagedBean
@ViewScoped
public class NacionalidadCreateBean {

	private static final Logger LOGGER = Logger.getLogger(NacionalidadCreateBean.class);

	private Nacionalidad nacionalidad;

	

	@EJB
	private NacionalidadController nacionalidadController;

	@ManagedProperty(value = "#{mensajeBean}")
	private MensajeBean mensajeBean;

	@PostConstruct
	public void init() {
		nacionalidad = new Nacionalidad();
	}

	public void guardar() {
		LOGGER.info("Init: Guardar");
		String result = nacionalidadController.guardar(nacionalidad, true);
		if (result == null) {
			mensajeBean.addMsg(MensajesTipo.SUCCESS, "Nacionalidad:", "Guardado correctamente");
			nacionalidad = new Nacionalidad();
		} else {
			mensajeBean.addMsg(MensajesTipo.DANGER, "Error:", result);
		}
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public MensajeBean getMensajeBean() {
		return mensajeBean;
	}

	public void setMensajeBean(MensajeBean mensajeBean) {
		this.mensajeBean = mensajeBean;
	}
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
