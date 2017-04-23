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
@Table(name = "parroquia")

public class Parroquia {
	
	public Parroquia() {
		super();
	}

	public Parroquia(String nombre, Canton canton) {
		super();
		this.id=null;
		this.nombre = nombre;
		this.canton = canton;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Canton canton;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Canton getCanton() {
		return canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}

	@Override
	public String toString() {
		return "parroquia [id=" + id + ", nombre=" + nombre + ", canton=" + canton + "]";
	}
	
	
	
	
}
