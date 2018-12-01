package negocio;

import java.util.ArrayList;

public class Aluno {

	private int codAluno;
	private String nomeAluno;
	private ArrayList<Disciplina> disciplinas;

	public Aluno() {

	}

	public Aluno(int codAluno, String nomeAluno) {
		this.codAluno = codAluno;
		this.nomeAluno = nomeAluno;
		disciplinas = new ArrayList<Disciplina>();
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
