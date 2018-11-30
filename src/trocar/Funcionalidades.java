package trocar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
			case 2:
				disciplinas.add(new Disciplina(disciplinas.size() + 1, tela.getTelaAdicionaDisciplina()));
			case 3:
				Integer codigoAluno = Integer.parseInt( tela.getTelaListaAlunos(alunos) );				
				Integer codigoDisciplina = Integer.parseInt( tela.getTelaListaDisciplinas(disciplinas) );
				Integer nota1 = Integer.parseInt( tela.getTelaAdicionarNota("nota 1") );
				Integer nota2 = Integer.parseInt( tela.getTelaAdicionarNota("nota 2") );
				Avaliacao avaliacao = new Avaliacao(alunos.get(codigoAluno), disciplinas.get(codigoDisciplina), nota1, nota2);
				curso.getAvaliacoes().add(avaliacao);
			}
			tela.telaInicial();
		} while (option != 0);
	}

	public void listaAluno() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("Nome do Aluno: " + alunos.get(i).getNomeAluno() + "Código do Aluno: "
					+ alunos.get(i).getCodAluno());
			ArrayList<Disciplina> disciplinasAluno = alunos.get(i).getDisciplina();
			for (Disciplina disciplina : disciplinasAluno) {
				System.out.println("Disciplina do aluno" + disciplina.getNomeDisciplina());
			}
		}
	}

	public void adicionaAvaliacao() {
		Curso c = new Curso();
		int i2 = Integer
				.parseInt((JOptionPane.showInputDialog(("Digite o código do aluno que deseja adicionar avaliação"))));
		int i3 = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina que deseja adicionar as notas"));
		int i4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1:"));
		int i5 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2"));
		c.adicionaAvaliacao(getAluno(i2), getDisciplina(i3), i4, i5);
		cursos.add(c);
	}

	public void listaBoletim() {

		for (int u = 0; u < cursos.size(); u++) {
			System.out.printf("Nome do Aluno: " + alunos.get(u).getNomeAluno() + "Código do Aluno: "
					+ alunos.get(u).getCodAluno());

			ArrayList<Disciplina> disciplinasAluno = alunos.get(u).getDisciplina();

			for (Disciplina disciplina : disciplinasAluno) {
				System.out.println("Disciplina do aluno" + disciplina.getNomeDisciplina());

			}

		}
	}

	public Aluno getAluno(int codAluno) {
		Aluno alunoRetorno = null;
		for (Aluno aluno : alunos) {
			if (codAluno == aluno.getCodAluno())
				alunoRetorno = aluno;
		}
		return alunoRetorno;
	}

	public Disciplina getDisciplina(int codDisciplina) {
		Disciplina disciplinaRetorno = null;
		for (Disciplina disciplina : disciplinas) {
			if (codDisciplina == disciplina.getCodDisciplina())
				disciplinaRetorno = disciplina;
		}

		return disciplinaRetorno;
	}

}
