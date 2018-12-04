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

		int option = 9;
		do {
			String optionString = tela.telaInicial();
			if (optionString == null) {
				option = 0;
			}
			try {
				option = Integer.parseInt(optionString);
			} catch (Exception e) {
			}

			switch (option) {
			case 1:
				alunos.add(new Aluno(alunos.size() + 1, tela.getTelaAdicionaAluno()));
				break;
			case 2:
				disciplinas.add(new Disciplina(disciplinas.size() + 1, tela.getTelaAdicionaDisciplina()));
				break;
			case 3:
				if (validacao.verificaExistenciaDeAluno(alunos)) {
					tela.getTelaErro("Não há alunos cadastrados!");
					break;
				} else if (validacao.verificaExistenciaDeDisciplina(disciplinas)) {
					tela.getTelaErro("Não há disciplinas cadastradas");
					break;
				}
				Integer codigoAluno = Integer.parseInt(tela.getTelaListaAlunos(alunos));
				if (validacao.verificaCodigoInexistenteAluno(alunos, codigoAluno)) {
					tela.getTelaErro("Aluno não encontrado!");
					break;
				}
				Integer codigoDisciplina = Integer.parseInt(tela.getTelaListaDisciplinas(disciplinas));
				if (validacao.verificaCodigoInexistenteDisciplina(disciplinas, codigoDisciplina)) {
					tela.getTelaErro("Disciplina não encontrada!");
					break;
				}
				Double nota1 = Double.parseDouble(tela.getTelaAdicionarNota("nota 1"));
				if (vn.validaNotaAcima(nota1) || vn.validaNotaNegativa(nota1)) {
					tela.getTelaErro("Valor inválido! ");
					break;
				}
				Double nota2 = Double.parseDouble(tela.getTelaAdicionarNota("nota 2"));
				if (vn.validaNotaAcima(nota2) || vn.validaNotaNegativa(nota2)) {
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
				tela.getTelaListagemCurso(curso);
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
