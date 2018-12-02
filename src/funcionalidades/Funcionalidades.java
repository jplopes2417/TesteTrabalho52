package funcionalidades;

import java.util.ArrayList;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Curso;
import negocio.Disciplina;
import ui.Telas;

public class Funcionalidades {

	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;
	private Curso curso;
	private Telas tela;

	public Funcionalidades() {
		alunos = new ArrayList<Aluno>();
		disciplinas = new ArrayList<Disciplina>();
		curso = new Curso();
		tela = new Telas();
	}

	public void mostrarOpcoes() {

		int option;

		do {
			option = Integer.parseInt(tela.telaInicial());

			switch (option) {
			case 1:
				alunos.add(new Aluno(alunos.size() + 1, tela.getTelaAdicionaAluno()));
				break;
			case 2:
				disciplinas.add(new Disciplina(disciplinas.size() + 1, tela.getTelaAdicionaDisciplina()));
				break;
			case 3:
				Integer codigoAluno = Integer.parseInt(tela.getTelaListaAlunos(alunos));
				Integer codigoDisciplina = Integer.parseInt(tela.getTelaListaDisciplinas(disciplinas));
				Integer nota1 = Integer.parseInt(tela.getTelaAdicionarNota("nota 1"));
				if (nota1 < 0) {
					Telas.getTelaErro(null);
				}
				Integer nota2 = Integer.parseInt(tela.getTelaAdicionarNota("nota 2"));
				Avaliacao avaliacao = new Avaliacao(Aluno.getAlunoPorCodigo(alunos, codigoAluno),
						Disciplina.getDisciplinaPorCodigo(disciplinas, codigoDisciplina), nota1, nota2);
				curso.getAvaliacoes().add(avaliacao);
				break;
			case 4:
				Telas.getTelaListagemCurso(curso);
				break;
			case 0:
				break;
			default:
				Telas.getTelaErro(null);
				break;
			}
		} while (option != 0);
	}

}
