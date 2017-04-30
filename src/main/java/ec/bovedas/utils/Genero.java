package ec.bovedas.utils;

public enum Genero {
	FEMENINO("Femenino"), MASCULINO("Masculino"), OTRO("Otro");
	private String description;

	private Genero(String description) {
		this.description = description;
	}

	public String getGenero() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}
