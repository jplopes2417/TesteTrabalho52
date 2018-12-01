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
				Integer codigoAluno = Integer.parseInt( tela.getTelaListaAlunos(alunos) );				
				Integer codigoDisciplina = Integer.parseInt( tela.getTelaListaDisciplinas(disciplinas) );
				Integer nota1 = Integer.parseInt( tela.getTelaAdicionarNota("nota 1") );
				Integer nota2 = Integer.parseInt( tela.getTelaAdicionarNota("nota 2") );
				Aluno aluno = alunos.stream().filter(a -> codigoAluno.equals(a.getCodAluno())).findAny().orElse(null);
				Disciplina disciplina = disciplinas.stream().filter(d -> codigoDisciplina.equals(d.getCodDisciplina())).findAny().orElse(null);
				Avaliacao avaliacao = new Avaliacao(aluno, disciplina, nota1, nota2);
				curso.getAvaliacoes().add(avaliacao);
				break;
			case 4:
				
				break;
			}
//			tela.telaInicial();
		} while (option != 0);
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
