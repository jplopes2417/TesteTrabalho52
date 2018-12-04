package negocio;

public class ValidacaoNotas {

	public boolean ValidaNotaAcima(double numero) {
		return numero > 10;
	}
	
	public boolean ValidaNotaNegativa(double numero) {	
		return numero < 0;
	}
}
