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
import ec.bovedas.models.entities.Empresa;
import ec.bovedas.models.entities.Parroquia;
import ec.bovedas.models.entities.Provincia;
import ec.bovedas.utils.Mensajes;

@ManagedBean
@ViewScoped
public class EmpresaUpdateBean {

	private Provincia provincia;
	private Canton canton;
	private Parroquia parroquia;
	private Empresa empresa;
	private List<Provincia> provincias;
	private List<Canton> cantones;
	private List<Parroquia> parroquias;

	@EJB
	private ProvinciaController provinciaController;
	@EJB
	private CantonController cantonController;
	@EJB
	private ParroquiaController parroquiaController;

	@PostConstruct
	public void init() {
		setProvincias(provinciaController.listarTodo());
	}

	public void actualizar() {
		Mensajes.addMsg(FacesMessage.SEVERITY_INFO, "Guardado");
	}

	public void onProvinciaChange() {
		if (this.provincia != null) {
			cantones = cantonController.listar(this.provincia);
			parroquias = new ArrayList<>();
		} else
			cantones = new ArrayList<>();
	}

	public void onCantonChange() {
		if (this.canton != null)
			parroquias = parroquiaController.listar(this.canton);
		else
			parroquias = new ArrayList<>();
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

	public List<Parroquia> getParroquias() {
		return parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
