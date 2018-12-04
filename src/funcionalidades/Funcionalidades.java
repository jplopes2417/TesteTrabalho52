package funcionalidades;

import java.util.ArrayList;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Curso;
import negocio.Disciplina;
import negocio.Media;
import negocio.ValidacaoNotas;
import ui.Telas;
import utils.ValidacaoUtils;

public class Funcionalidades {

	private ArrayList<Aluno> alunos;
	private ArrayList<Disciplina> disciplinas;
	private Curso curso;
	private Telas tela;
	private ValidacaoUtils validacao;
	private ValidacaoNotas vn;

	public Funcionalidades() {
		alunos = new ArrayList<Aluno>();
		disciplinas = new ArrayList<Disciplina>();
		curso = new Curso();
		tela = new Telas();
		validacao = new ValidacaoUtils();
		vn = new ValidacaoNotas();
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
				 if (validacao.VerificaExistenciaDeAluno(alunos)) {
					 tela.getTelaErro("Não há alunos cadastrados!");
					 break;
				 } else if (validacao.VerificaExistenciaDeDisciplina(disciplinas)) {
					 tela.getTelaErro("Não há disciplinas cadastradas");
					 break;
				 }
				Integer codigoAluno = Integer.parseInt(tela.getTelaListaAlunos(alunos));
				Integer codigoDisciplina = Integer.parseInt(tela.getTelaListaDisciplinas(disciplinas));
				Double nota1 = Double.parseDouble(tela.getTelaAdicionarNota("nota 1"));
				if (vn.ValidaNotaAcima(nota1) || vn.ValidaNotaNegativa(nota1)) {
					tela.getTelaErro("Valor inválido! ");
					break;
				}
				Double nota2 = Double.parseDouble(tela.getTelaAdicionarNota("nota 2"));
				if (vn.ValidaNotaAcima(nota2) || vn.ValidaNotaNegativa(nota2)) {
					tela.getTelaErro("Valor inválido! ");
					break;
				}
				Double mediaAritmetica = Media.calculaMediaAritmetica(nota1, nota2);
				Double mediaPonderada = Media.calculaMediaPonderada(nota1, nota2);
				Avaliacao avaliacao = new Avaliacao(Aluno.getAlunoPorCodigo(alunos, codigoAluno),
						Disciplina.getDisciplinaPorCodigo(disciplinas, codigoDisciplina), nota1, nota2, mediaAritmetica,
						mediaPonderada);
				curso.getAvaliacoes().add(avaliacao);
				break;
			case 4:
				if (curso == null) {
					tela.getTelaErro("Não há boletins a serem listados");
					break;
				}
				Telas.getTelaListagemCurso(curso);
				break;
			case 0:
				break;
			default:
				tela.getTelaErro("Opção Inválida");
				break;
			}
		} while (option != 0);
	}

}
