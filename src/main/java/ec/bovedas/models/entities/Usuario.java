package ec.bovedas.models.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cedula", unique = true, nullable = false, length = 10)
	private String cedula;

	@Column(name = "clave", unique = false, nullable = false, length = 250)
	private String clave;

	@Column(name = "email", unique = true, nullable = false, length = 50)
	private String email;

	@Column(name = "nombre", unique = false, nullable = false, length = 50)
	private String nombre;

	@Column(name = "apellido", unique = false, nullable = false, length = 50)
	private String apellido;

	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}

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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", cedula=" + cedula + "]";
	}

}
