package negocio;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCalculaMediaAritmetica() {
		double n1 = 5;
		double n2 = 10;
		double esperado = 7.5;
		double resultado = Media.calculaMediaAritmetica(n1, n2);
		assertEquals(esperado, resultado);
		System.out.println("Resultado Aritmetico: " + resultado);
	}

	@Test
	void testCalculaMediaPonderada() {
		double n1 = 8;
		double n2 = 7;
		double esperado = 7.33;
		DecimalFormat dc = new DecimalFormat("0.00");
		double resultado = Media.calculaMediaPonderada(n1, n2);
		assertEquals(dc.format(esperado), dc.format(resultado));
		System.out.println("Resultado Ponderado: " + dc.format(resultado));
	}

	@Test
	void testCalculaMediaAritmeticaNegativa() {
		double n1 = -1;
		double n2 = -2;
		double resultado = Media.calculaMediaAritmetica(n1, n2);
		assertTrue(resultado < 0);
		System.out.println("Resultado Aritmetico: " + resultado);
	}	

	@Test
	void testCalculaMediaPonderadaNegativa() {
		double n1 = -1;
		double n2 = -2;
		double resultado = Media.calculaMediaPonderada(n1, n2);
		assertTrue(resultado < 0);
		System.out.println("Resultado Ponderado: " + resultado);
	}
	
	
}
