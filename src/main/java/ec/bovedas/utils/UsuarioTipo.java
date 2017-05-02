package ec.bovedas.utils;

public enum UsuarioTipo {
	ADMINISTRADOR("Administrador"), COLABORADOR("Colaborador");

	private String description;

	private UsuarioTipo(String description) {
		this.description = description;
	}

	public String getUsuarioTipo() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}
