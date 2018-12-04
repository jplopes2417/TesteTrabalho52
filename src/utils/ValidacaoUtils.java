package utils;

import java.util.ArrayList;
import negocio.Aluno;
import negocio.Disciplina;

public class ValidacaoUtils {

	public boolean VerificaExistenciaDeAluno(ArrayList<Aluno> alunos) {
		return alunos.isEmpty();
	}

	public boolean VerificaExistenciaDeDisciplina(ArrayList<Disciplina> disciplinas) {
		return disciplinas.isEmpty();
	}
}