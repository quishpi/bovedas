package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.bovedas.utils.EstadoCivil;
import ec.bovedas.utils.Genero;

@Entity
@Table(name = "fallecido")
public class Fallecido {

	public Fallecido() {
		super();
	}

	public Fallecido(String cedula, String nombre, String apelido, String numeroregistroinscripcion,
			Date fechainscripciondefuncion, Date fechafallecimiento, Nacionalidad nacionalidad, Genero genero,
			EstadoCivil estadocivil, Integer edad, Date fechaingresocementerio) {
		super();
		this.id = null;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apelido = apelido;
		this.numeroregistroinscripcion = numeroregistroinscripcion;
		this.fechainscripciondefuncion = fechainscripciondefuncion;
		this.fechafallecimiento = fechafallecimiento;
		this.nacionalidad = nacionalidad;
		this.genero = genero;
		this.estadocivil = estadocivil;
		this.edad = edad;
		this.fechaingresocementerio = fechaingresocementerio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "cedula", unique = true, nullable = false, length = 13)
	private String cedula;

	@Column(name = "nombre", unique = false, nullable = false, length = 50)
	private String nombre;

	@Column(name = "apellido", unique = false, nullable = false, length = 50)
	private String apelido;

	@Column(name = "numeroregistroinscripcion", unique = false, nullable = false, length = 50)
	private String numeroregistroinscripcion;

	@Column(name = "fechainscripciondefuncion", unique = false, nullable = false, length = 50)
	private Date fechainscripciondefuncion;

	@Column(name = "fechafallecimiento", unique = false, nullable = false, length = 50)
	private Date fechafallecimiento;

	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Nacionalidad nacionalidad;

	// @ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Genero genero;

	// @ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private EstadoCivil estadocivil;

	@Column(name = "edad", unique = false, nullable = false, length = 50)
	private Integer edad;

	@Column(name = "fechaingresocementerio", unique = false, nullable = false, length = 50)
	private Date fechaingresocementerio;

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

	public String getNumeroregistroinscripcion() {
		return numeroregistroinscripcion;
	}

	public void setNumeroregistroinscripcion(String numeroregistroinscripcion) {
		this.numeroregistroinscripcion = numeroregistroinscripcion;
	}

	public Date getFechainscripciondefuncion() {
		return fechainscripciondefuncion;
	}

	public void setFechainscripciondefuncion(Date fechainscripciondefuncion) {
		this.fechainscripciondefuncion = fechainscripciondefuncion;
	}

	public Date getFechafallecimiento() {
		return fechafallecimiento;
	}

	public void setFechafallecimiento(Date fechafallecimiento) {
		this.fechafallecimiento = fechafallecimiento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaingresocementerio() {
		return fechaingresocementerio;
	}

	public void setFechaingresocementerio(Date fechaingresocementerio) {
		this.fechaingresocementerio = fechaingresocementerio;
	}

	@Override
	public String toString() {
		return "Fallecido [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apelido=" + apelido
				+ ", numeroregistroinscripcion=" + numeroregistroinscripcion + ", fechainscripciondefuncion="
				+ fechainscripciondefuncion + ", fechafallecimiento=" + fechafallecimiento + ", nacionalidad="
				+ nacionalidad + ", genero=" + genero + ", estadocivil=" + estadocivil + ", edad=" + edad
				+ ", fechaingresocementerio=" + fechaingresocementerio + "]";
	}

}
