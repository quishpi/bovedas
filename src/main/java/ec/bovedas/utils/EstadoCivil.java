package ec.bovedas.utils;

public enum EstadoCivil {
	SOLTERO("Soltero"), CASADO("Casado"), VUIDO("Viudo"), DIVORCIADO("Divorciado"), UNIONLIBRE("Unio libre");

	private String description;

	private EstadoCivil(String description) {
		this.description = description;
	}

	public String getEstadoCivil() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}
