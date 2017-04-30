package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "representante")

public class Representante {
	
	public Representante() {
		super();
	}

	public Representante(String cedula, String nombre, String apelido, Parroquia parroquia,
			String direccion, String telefono, Double porcentajeExoneracion, String observacion) {
		super();
		this.id = null;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apelido = apelido;
		this.parroquia = parroquia;
		this.direccion = direccion;
		this.telefono = telefono;
		this.porcentajeExoneracion = porcentajeExoneracion;
		this.observacion = observacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "cedula", unique = true, nullable = false, length = 13)
	private String cedula;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "apellido",  nullable = false, length = 50)
	private String apelido;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Parroquia parroquia;
	
	@Column(name = "direccion", nullable = false, length = 50)
	private String direccion;
	
	@Column(name = "telefono",  nullable = false, length = 50)
	private String telefono;
	
	@Column(name = "porcentajeExoneracion", nullable = false)
	private Double porcentajeExoneracion = 0.0;
	
	@Column(name = "observacion", nullable = false, length = 500)
	private String observacion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Double getPorcentajeExoneracion() {
		return porcentajeExoneracion;
	}

	public void setPorcentajeExoneracion(Double porcentajeExoneracion) {
		this.porcentajeExoneracion = porcentajeExoneracion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Representante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apelido=" + apelido
				+ ", parroquia=" + parroquia + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", porcentajeExoneracion=" + porcentajeExoneracion + ", observacion=" + observacion + "]";
	}
	
	}
