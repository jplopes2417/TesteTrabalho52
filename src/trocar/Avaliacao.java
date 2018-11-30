package trocar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Avaliacao {
	private Aluno aluno;
	private Disciplina disciplina;
	private double n1, n2;

	public Avaliacao(Aluno aluno, Disciplina disciplina, double n1, double n2) {

		this.aluno = aluno;
		this.disciplina = disciplina;
		this.n1 = n1;
		this.n2 = n2;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double calculaMediaAritmetica() {

		double mediaAritmetica = ((n1 + n2) / 2);

		return mediaAritmetica;
	}

	public double calculaMediaPonderada() {

		double mediaPonderada = ((1 * n1) + (2 * n2) / (1 + 2));
		return mediaPonderada;

	}

}
