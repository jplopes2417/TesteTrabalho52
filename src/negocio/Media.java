package negocio;

public class Media {

	public static double calculaMediaAritmetica(double n1, double n2) {;		
		double mediaAritmetica = ((n1 + n2) / 2);
		return mediaAritmetica;
	}

	public static double calculaMediaPonderada(double n1, double n2) {
		double mediaPonderada = (((1 * n1) + (2 * n2)) / (1 + 2));
		return mediaPonderada;

	}
	
}
