package negocio;

public class ValidacaoNotas {

	public boolean validaNotaAcima(double numero) {
		return numero > 10;
	}
	
	public boolean validaNotaNegativa(double numero) {	
		return numero < 0;
	}
}
