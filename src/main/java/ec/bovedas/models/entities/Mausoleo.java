package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ec.bovedas.utils.EstadoFisico;

@Entity
@Table(name = "mausoleo")

public class Mausoleo {

	public Mausoleo() {
		super();
	}

	public Mausoleo(Integer numero, String nombre, Integer numeroBovedas, EstadoFisico estadoFisico) {
		super();
		this.id = null;
		this.numero = numero;
		this.nombre = nombre;
		this.numeroBovedas = numeroBovedas;
		this.estadoFisico = estadoFisico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "numero", unique = false, nullable = false)
	private Integer numero;

	@Column(name = "nombre", unique = true, nullable = false, length = 50)
	private String nombre;

	@Column(name = "numeroBovedad", unique = false, nullable = false)
	private Integer numeroBovedas;

	@Column(name = "estadoFisico", unique = false, nullable = false)
	private EstadoFisico estadoFisico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroBovedas() {
		return numeroBovedas;
	}

	public void setNumeroBovedas(Integer numerofilas) {
		this.numeroBovedas = numerofilas;
	}

	public EstadoFisico getEstadoFisico() {
		return estadoFisico;
	}

	public void setEstadoFisico(EstadoFisico estadoFisico) {
		this.estadoFisico = estadoFisico;
	}

	@Override
	public String toString() {
		return "Mausoleo [id=" + id + ", numero=" + numero + ", nombre=" + nombre + ", numeroBovedas=" + numeroBovedas
				+ ", estadoFisico=" + estadoFisico + "]";
	}

}
