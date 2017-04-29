package ec.bovedas.views.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

import ec.bovedas.controllers.CantonController;
import ec.bovedas.controllers.ParroquiaController;
import ec.bovedas.controllers.ProvinciaController;
import ec.bovedas.controllers.RepresentanteController;
import ec.bovedas.models.entities.Canton;
import ec.bovedas.models.entities.Parroquia;
import ec.bovedas.models.entities.Provincia;
import ec.bovedas.models.entities.Representante;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class RepresentanteCreateBean {

	private static final Logger LOGGER = Logger.getLogger(RepresentanteCreateBean.class);

	private Representante representante;

	private Parroquia parroquia;
	private Provincia provincia;
	private Canton canton;

	private List<Provincia> provincias;
	private List<Canton> cantones;
	private List<Parroquia> parroquias;

	@EJB
	private RepresentanteController representanteController;
	@EJB
	private ParroquiaController parroquiaController;
	@EJB
	private ProvinciaController provinciaController;
	@EJB
	private CantonController cantonController;

	@PostConstruct
	public void init() {
		setParroquias(new ArrayList<>());
		setCantones(new ArrayList<>());
		setProvincias(provinciaController.listarTodo());

		representante = new Representante();

	}

	public void guardar() {
		LOGGER.info("Init: Guardar");

		String result = representanteController.guardar(representante, true);
		if (result == null) {
			representante = new Representante();
			Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado correctamente");
		} else {
			Mensajes.addMsg(FacesMessage.SEVERITY_ERROR, "Error: " + result);
		}
	}
	
	public void onProvinciaChange() {
		if (this.provincia != null)
			cantones = cantonController.listar(this.provincia);
		else
			cantones = new ArrayList<>();
	}
	public void onCantonChange() {
		if (this.canton != null)
			parroquias = parroquiaController.listar(this.canton);
		else
			parroquias = new ArrayList<>();
	}


	public void actualizar() {

	}

	public void eliminar() {

	}

	public boolean existeParametros() {
		return false;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Canton getCanton() {
		return canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
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

	public List<Parroquia> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

}
