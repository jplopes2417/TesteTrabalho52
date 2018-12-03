package negocio;

public class ValidacaoNotas {

	public static boolean ValidaNotas(double numero) {
		boolean validador = false;
		if (numero < 0) {
		validador = true;
		} else if (numero > 10) {
			validador = true;
		}
		return validador;
	}
	
}
