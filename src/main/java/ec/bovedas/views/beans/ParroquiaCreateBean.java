package ec.bovedas.views.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.controllers.ParroquiaController;
import ec.bovedas.controllers.ProvinciaController;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Parroquia;
import ec.bovedas.models.entities.Provincia;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class ParroquiaCreateBean {

	private Parroquia parroquia;
	private Provincia provincia;
	private List<Provincia> provincias;
	private List<Canton> cantones;

	@EJB
	private ParroquiaController parroquiaController;
	@EJB
	private ProvinciaController provinciaController;
	@EJB
	private CantonController cantonController;

	@PostConstruct
	public void init() {
		parroquia = new Parroquia();
		cantones = new ArrayList<>();
		provincias = provinciaController.listarTodo();
	}

	public void guardar() {
		String result = parroquiaController.guardar(parroquia, true);
		if (result == null) {
			parroquia = new Parroquia();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, " Error: " + result);
		}
	}

	public void onProvinciaChange() {
		if (this.provincia != null)
			cantones = cantonController.listar(this.provincia);
		else
			cantones = new ArrayList<>();
	}

	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	public List<Canton> getCantones() {
		return cantones;
	}

	public void setCantones(List<Canton> cantones) {
		this.cantones = cantones;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
