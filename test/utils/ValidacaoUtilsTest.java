package utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import negocio.Aluno;
import negocio.Disciplina;

class ValidacaoUtilsTest {
	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;
	private ValidacaoUtils validacao;

	@BeforeEach
	public void setUp() throws Exception {
		alunos = new ArrayList<Aluno>();
		disciplinas = new ArrayList<Disciplina>();
		validacao = new ValidacaoUtils();
	}

	@Test
	public void testVerificaExistenciaDeAlunoComAluno() {
		Aluno aluno1 = new Aluno(1, "Isto");
		alunos.add(aluno1);
		assertFalse(validacao.verificaExistenciaDeAluno(alunos));
	}
	
	@Test
	public void testVerificaExistenciaDeAlunoSemAluno() {
		assertTrue(validacao.verificaExistenciaDeAluno(alunos));
	}

	@Test
	public void testVerificaExistenciaDeDisciplinaComDisciplina() {
		Disciplina disciplina1 = new Disciplina (1, "Teste");
		disciplinas.add(disciplina1);
		assertFalse(validacao.verificaExistenciaDeDisciplina(disciplinas));
	}

	@Test
	public void testVerificaExistenciaDeDisciplinaSemDisciplina() {
		assertTrue(validacao.verificaExistenciaDeDisciplina(disciplinas));
	}
	
	@Test
	public void testVerificaCodigoInexistenteAluno() {
		int codigoAluno = 2;
		assertTrue(validacao.verificaCodigoInexistenteAluno(alunos, codigoAluno));
	}

	@Test
	public void testVerificaCodigoInexistenteDisciplina() {
		int codigoDisciplina = 3;
		assertTrue(validacao.verificaCodigoInexistenteDisciplina(disciplinas, codigoDisciplina));
	}

	@Test
	public void testValidaNotaAcima() {
		assertTrue(validacao.validaNotaAcima(11));
	}

	@Test
	public void testValidaNotaNegativa() {
		assertTrue(validacao.validaNotaNegativa(-1));
	}

	@Test
	public void testValidaValorNulo() {
		assertTrue(validacao.validaValorNulo(null));
	}

}
