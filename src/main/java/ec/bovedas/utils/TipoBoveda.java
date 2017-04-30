package ec.bovedas.utils;

public enum TipoBoveda {
	NICHO("Nicho"), BOVEDA("B�veda");

	private String description;

	private TipoBoveda(String description) {
		this.description = description;
	}

	public String getTipoBoveda() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}
