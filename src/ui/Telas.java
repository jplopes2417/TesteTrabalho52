package ui;

import java.util.List;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.Disciplina;

public class Telas {

	public String telaInicial() {
		return JOptionPane.showInputDialog("========================================================\n"
				+ "Bem vindo!\nEscolha uma das opções abaixo:\n"
				+ "1 - Adicionar aluno\n"
				+ "2 - Adicionar disciplina\n"
				+ "3 - Adicionar nota\n"
				+ "4 - Listar boletim\n"
				+ "0 - Sair"
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
	

	
/*
	public void listaBoletim() {

		for (int u = 0; u < curso.size(); u++) {
			System.out.printf("Nome do Aluno: " + alunos.get(u).getNomeAluno() + "Código do Aluno: "
					+ alunos.get(u).getCodAluno());

			ArrayList<Disciplina> disciplinasAluno = alunos.get(u).getDisciplina();

			for (Disciplina disciplina : disciplinasAluno) {
				System.out.println("Disciplina do aluno" + disciplina.getNomeDisciplina());

			}

		}
	}*/
	
}