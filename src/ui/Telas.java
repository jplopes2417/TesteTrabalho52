package ui;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.Avaliacao;
import negocio.Curso;
import negocio.Disciplina;
import negocio.StatusDisciplina;

public class Telas {

	public String telaInicial() {
		return JOptionPane.showInputDialog("========================================================\n"
				+ "Bem vindo!\nEscolha uma das opções abaixo:\n" + "1 - Adicionar aluno\n"
				+ "2 - Adicionar disciplina\n" + "3 - Adicionar notas\n" + "4 - Listar boletins\n" + "0 - Sair"
				+ "\n========================================================");

	}

	public String getTelaAdicionaAluno() {
		return JOptionPane.showInputDialog("Digite o nome do Aluno: ");
	}

	public String getTelaAdicionaDisciplina() {
		return JOptionPane.showInputDialog("Digite o nome da disciplina: ");
	}

	public String getTelaAdicionarNota(String valor) {
		return JOptionPane.showInputDialog("Adicionar nota " + valor);
	}

	public String getTelaListaAlunos(List<Aluno> alunos) {
		String retorno = "Digite o codigo do aluno: " + "\n";
		for (Aluno aluno : alunos) {
			retorno += aluno.getCodAluno() + " - " + aluno.getNomeAluno() + "\n";
		}
		return JOptionPane.showInputDialog(retorno);
	}

	public String getTelaListaDisciplinas(List<Disciplina> disciplinas) {
		String retorno = "Digite o codigo da disciplina: " + "\n";
		for (Disciplina disciplina : disciplinas) {
			retorno += disciplina.getCodDisciplina() + " - " + disciplina.getNomeDisciplina() + "\n";
		}
		return JOptionPane.showInputDialog(retorno);
	}

	public void getTelaListagemCurso(Curso curso) {
		DecimalFormat df = new DecimalFormat("0.00");
		String retorno = "";
		List<Avaliacao> avaliacoes = curso.getAvaliacoes().stream()
				.sorted((o1, o2) -> o1.getAluno().getNomeAluno().compareTo(o2.getAluno().getNomeAluno()))
				.collect(Collectors.toList());
		if(avaliacoes.isEmpty()) {
			retorno = "Não há boletins a serem listados! ";
		}
		for (Avaliacao avaliacao : avaliacoes) {
			retorno += "Cod aluno: " + avaliacao.getAluno().getCodAluno() + " - " + "Nome aluno: "
					+ avaliacao.getAluno().getNomeAluno() + " - " + "Cod Disciplina: "
					+ avaliacao.getDisciplina().getCodDisciplina() + " - " + "Nome Disciplina: "
					+ avaliacao.getDisciplina().getNomeDisciplina() + " - " + "Nota 1: " + avaliacao.getN1() + " - "
					+ "Nota 2: " + avaliacao.getN2() + " - " + "Media Aritmetica: "
					+ df.format(avaliacao.getMediaAritmetica()) + " - " + "Media Ponderada: "
					+ df.format(avaliacao.getMediaPonderada()) + " - " + "Status: " 
					+ StatusDisciplina.alunoAprovado(avaliacao.getMediaAritmetica(), avaliacao.getMediaPonderada())
					+ "\n";
		}
		JOptionPane.showMessageDialog(null, retorno);
	}

	public void getTelaErro(String mensagemErro) {
		JOptionPane.showMessageDialog(null, mensagemErro);
	}

}