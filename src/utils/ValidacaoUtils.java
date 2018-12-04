package utils;

import java.util.ArrayList;
import negocio.Aluno;
import negocio.Disciplina;

public class ValidacaoUtils {

	public boolean verificaExistenciaDeAluno(ArrayList<Aluno> alunos) {
		return alunos.isEmpty();
	}

	public boolean verificaExistenciaDeDisciplina(ArrayList<Disciplina> disciplinas) {
		return disciplinas.isEmpty();
	}

	public boolean verificaCodigoInexistenteAluno(ArrayList<Aluno> alunos, int codigo) {
		for (Aluno aluno : alunos) {
			if (aluno.getCodAluno() == codigo) {
				return false;
			}
		}
		return true;
	}

	public boolean verificaCodigoInexistenteDisciplina(ArrayList<Disciplina> disciplinas, int codigo) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getCodDisciplina() == codigo) {
				return false;
			}
		}
		return true;
	}

	public boolean validaNotaAcima(double numero) {
		return numero > 10;
	}

	public boolean validaNotaNegativa(double numero) {
		return numero < 0;
	}

	public boolean validaValorNulo(String valor) {
		return valor == null;
	}
}