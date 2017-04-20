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
@Table(name = "representanteFallecido")
public class RepresentanteFallecido {
	
	
	public RepresentanteFallecido() {
		super();
	}

	public RepresentanteFallecido(Representante representante, Fallecido fallecido) {
		super();
		this.id = null;
		this.representante = representante;
		this.fallecido = fallecido;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Representante representante;
	
	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Fallecido fallecido;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public Fallecido getFallecido() {
		return fallecido;
	}

	public void setFallecido(Fallecido fallecido) {
		this.fallecido = fallecido;
	}

	@Override
	public String toString() {
		return "RepresentanteFallecido [id=" + id + ", representante=" + representante + ", fallecido=" + fallecido
				+ "]";
	}

	
	
}
