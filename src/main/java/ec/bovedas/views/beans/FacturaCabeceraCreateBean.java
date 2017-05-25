package ec.bovedas.views.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ec.bovedas.controllers.FacturaCabeceraController;
import ec.bovedas.models.entities.FacturaCabecera;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class FacturaCabeceraCreateBean {

	private FacturaCabecera facturaCabecera;

	@EJB

	private FacturaCabeceraController facturaCabeceraController;

	@PostConstruct
	public void init() {
		
	 facturaCabecera= new FacturaCabecera() ;		
		
	}

	public void guardar() {
		String result = facturaCabeceraController.guardar(facturaCabecera, true);
		if (result == null) {
			facturaCabecera = new FacturaCabecera();
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

	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

}
