package ui;

import java.util.List;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Curso;
import negocio.Disciplina;

public class Telas {

	public String telaInicial() {
		return JOptionPane.showInputDialog("========================================================\n"
				+ "Bem vindo!\nEscolha uma das opções abaixo:\n" + "1 - Adicionar aluno\n"
				+ "2 - Adicionar disciplina\n" + "3 - Adicionar nota\n" + "4 - Listar boletim\n" + "0 - Sair"
				+ "\n========================================================");

	}

	public String getTelaAdicionaAluno() {
		return JOptionPane.showInputDialog("Digite o nome do Aluno");
	}

	public String getTelaAdicionaDisciplina() {
		return JOptionPane.showInputDialog("Digite o nome da disciplina:");
	}

	public String getTelaAdicionarNota(String valor) {
		return JOptionPane.showInputDialog("Adicionar nota " + valor);
	}

	public String getTelaListaAlunos(List<Aluno> alunos) {
		String retorno = "Digite o codigo do aluno";
		for (Aluno aluno : alunos) {
			retorno += aluno.getCodAluno() + " - " + aluno.getNomeAluno() + "\n";
		}
		return JOptionPane.showInputDialog(retorno);
	}

	public String getTelaListaDisciplinas(List<Disciplina> disciplinas) {
		String retorno = "Digite o codigo da disciplina";
		for (Disciplina disciplina : disciplinas) {
			retorno += disciplina.getCodDisciplina() + " - " + disciplina.getNomeDisciplina() + "\n";
		}
		return JOptionPane.showInputDialog(retorno);
	}

	public String getTelaListagemCurso(Curso curso) {
		String retorno = "";
		for (Avaliacao avaliacao : curso.getAvaliacoes()) {
			retorno += avaliacao.getAluno().getCodAluno() + " - " + avaliacao.getAluno().getNomeAluno() + " - "
					+ avaliacao.getDisciplina().getCodDisciplina() + " - "
					+ avaliacao.getDisciplina().getNomeDisciplina() + " - " + avaliacao.getN1() + " - "
					+ avaliacao.getN2() + " - " + avaliacao.calculaMediaAritmetica() // calculoMedia(avaliacao.getN1(),
																						// avaliacao.getN1())
					+ " - " + avaliacao.calculaMediaPonderada() + "\n"; // calculoMediaPonderada(avaliacao.getN1(),
																		// avaliacao.getN1());
		}
		return JOptionPane.showInputDialog(retorno);
	}

	public String getTelaListagemAvaliacoesPorAluno(Curso curso, int codigoAluno) {
		String retorno = "";
		for (Avaliacao avaliacao : curso.getAvaliacoes().stream()
				.filter(a -> a.getAluno().getCodAluno() == codigoAluno).findAny()) {
			retorno += avaliacao.getAluno().getCodAluno() + " - " + avaliacao.getAluno().getNomeAluno() + " - "
					+ avaliacao.getDisciplina() + " - " + avaliacao.getN1() + " - " + avaliacao.getN2() + " - "
					+ avaliacao.calculaMediaAritmetica() // calculoMedia(avaliacao.getN1(), avaliacao.getN2())
					+ " - " + avaliacao.calculaMediaPonderada(); // calculoMediaPonderada(avaliacao.getN1(),
																	// avaliacao.getN2());
		}
		return JOptionPane.showInputDialog(retorno);
	}

}