package funcionalidades;

import java.util.ArrayList;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Curso;
import negocio.Disciplina;
import negocio.ValidacaoNotas;
import ui.Telas;
import ui.TelasErro;

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
				if (alunos.isEmpty()) {
					TelasErro.getTelaErroAlunoNaoCadastrado();
					break;
				} else if (disciplinas.isEmpty()) {
					TelasErro.getTelaErroDisciplinaNaoCadastrada();
					break;
				}
				Integer codigoAluno = Integer.parseInt(tela.getTelaListaAlunos(alunos));
				Integer codigoDisciplina = Integer.parseInt(tela.getTelaListaDisciplinas(disciplinas));
				Double nota1 = Double.parseDouble(tela.getTelaAdicionarNota("nota 1"));
				// ValidacaoNotas.ValidaNotas(nota1);
				boolean resultado1 = ValidacaoNotas.ValidaNotas(nota1);
				if (resultado1 == true) {
					TelasErro.getTelaErroNotas();
					break;
				}
				Double nota2 = Double.parseDouble(tela.getTelaAdicionarNota("nota 2"));
				boolean resultado2 = ValidacaoNotas.ValidaNotas(nota2);
				if (resultado2 == true) {
					TelasErro.getTelaErroNotas();
					break;
				}
				Avaliacao avaliacao = new Avaliacao(Aluno.getAlunoPorCodigo(alunos, codigoAluno),
						Disciplina.getDisciplinaPorCodigo(disciplinas, codigoDisciplina), nota1, nota2);
				curso.getAvaliacoes().add(avaliacao);
				break;
			case 4:
				if (curso == null) {
					TelasErro.getTelaErroBoletim();
					break;
				}
				Telas.getTelaListagemCurso(curso);
				break;
			case 0:
				break;
			default:
				TelasErro.getTelaErro(null);
				break;
			}
		} while (option != 0);
	}

}
