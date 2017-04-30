package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.MausoleoController;
import ec.bovedas.models.entities.Mausoleo;
import ec.bovedas.models.entities.Nacionalidad;
import ec.bovedas.utils.EstadoFisico;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class MausoleoCreateBean {

	private static final Logger LOGGER = Logger.getLogger(MausoleoCreateBean.class);

	private Mausoleo mausoleo;

	@EJB
	private MausoleoController mausoleoController;

	@PostConstruct
	public void init() {
		mausoleo = new Mausoleo();
	}

	public void guardar() {
		LOGGER.info("Init: Guardar");
		
		String result = mausoleoController.guardar(mausoleo, true);
		if (result == null) {
			mausoleo = new Mausoleo();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}
	public EstadoFisico[] getEstadoFisicos()
	{
		return EstadoFisico.values();
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Mausoleo getMausoleo() {
		return mausoleo;
	}

	public void setMausoleo(Mausoleo mausoleo) {
		this.mausoleo = mausoleo;
	}


}
