package ec.bovedas.models.entities;

import static javax.persistence.GenerationType.IDENTITY;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mausoleo")

public class Mausoleo {
	
	public Mausoleo() {
		super();
	}

	public Mausoleo(Integer numero, String nombre, Integer numerofilas, Integer numeroColumnas,
			Integer estadoFisico) {
		super();
		this.id = null;
		this.numero = numero;
		this.nombre = nombre;
		this.numerofilas = numerofilas;
		this.numeroColumnas = numeroColumnas;
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
	
	@Column(name = "numeroFilas", unique = false, nullable = false)
	private Integer numerofilas;
	
	@Column(name = "numeroColumnas", unique = false, nullable = false)
	private Integer numeroColumnas;	
	
	@Column(name = "estadoFisico", unique = false, nullable = false)
	private Integer estadoFisico;

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

	public Integer getNumerofilas() {
		return numerofilas;
	}

	public void setNumerofilas(Integer numerofilas) {
		this.numerofilas = numerofilas;
	}

	public Integer getNumeroColumnas() {
		return numeroColumnas;
	}

	public void setNumeroColumnas(Integer numeroColumnas) {
		this.numeroColumnas = numeroColumnas;
	}

	public Integer getEstadoFisico() {
		return estadoFisico;
	}

	public void setEstadoFisico(Integer estadoFisico) {
		this.estadoFisico = estadoFisico;
	}

	@Override
	public String toString() {
		return "Mausoleo [id=" + id + ", numero=" + numero + ", nombre=" + nombre + ", numerofilas=" + numerofilas
				+ ", numeroColumnas=" + numeroColumnas + ", estadoFisico=" + estadoFisico + "]";
	}
	
}
