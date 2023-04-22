package cleanArchScholl.commons;

public class CPF {

	private String aNumero;

	public CPF (String pNumero) {
		if ( pNumero != null && !pNumero.isEmpty() && !pNumero.isBlank() &&
				pNumero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")
		) {
			this.aNumero = pNumero;
		} else {
			throw new IllegalArgumentException("CPF Inválido!");
		}
	}

}