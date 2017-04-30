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
@Table(name = "actadefuncion")


public class ActaDefuncion {
			
	
	public ActaDefuncion() {
		super();
	}

	public ActaDefuncion( String archivo, Fallecido fallecido) {
		super();
		this.id = null;
		this.archivo = archivo;
		this.fallecido = fallecido;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "archivo", unique = true, nullable = false, length = 500)
	private String archivo;

	@ManyToOne(cascade = CascadeType.REFRESH, optional = false)
	private Fallecido fallecido;
	
	
	
	public Fallecido getFallecido() {
		return fallecido;
	}

	public void setFallecido(Fallecido fallecido) {
		this.fallecido = fallecido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	@Override
	public String toString() {
		return "ActaDefuncion [id=" + id + ", archivo=" + archivo + "]";
	}
	
	}
