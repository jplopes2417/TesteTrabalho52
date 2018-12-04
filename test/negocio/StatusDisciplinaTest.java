package negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatusDisciplinaTest {

	@Test
	void testAlunoRerovado() {
		assertEquals("Reprovado! ", StatusDisciplina.alunoAprovado(3, 2));
	}
	
	@Test
	void testAlunoAprovado() {
		assertEquals("Aprovado! ", StatusDisciplina.alunoAprovado(9, 8));
	}

}
