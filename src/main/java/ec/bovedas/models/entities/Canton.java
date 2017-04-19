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
@Table(name = "canton")

public class Canton {

	public Canton(String nombre, Provincia provincia) {
		super();
		this.id = null;
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public Canton() {
		super();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "nombre", unique = true, nullable = false, length = 50)
	private String nombre;

	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Provincia provincia;

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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "canton [id=" + id + ", nombre=" + nombre + ", provincia=" + provincia + "]";
	}

}
