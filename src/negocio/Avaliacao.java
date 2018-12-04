package negocio;

public class Avaliacao {
	private Aluno aluno;
	private Disciplina disciplina;
	private double n1, n2;
	private double mediaAritmetica;
	private double mediaPonderada;

	public Avaliacao(Aluno aluno, Disciplina disciplina, double n1, double n2, double mediaAritmetica, double mediaPonderada) {

		this.aluno = aluno;
		this.disciplina = disciplina;
		this.n1 = n1;
		this.n2 = n2;
		this.setMediaAritmetica(mediaAritmetica);
		this.setMediaPonderada(mediaPonderada);
		
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

	public double getMediaAritmetica() {
		return mediaAritmetica;
	}

	public void setMediaAritmetica(double mediaAritmetica) {
		this.mediaAritmetica = mediaAritmetica;
	}

	public double getMediaPonderada() {
		return mediaPonderada;
	}

	public void setMediaPonderada(double mediaPonderada) {
		this.mediaPonderada = mediaPonderada;
	}

}
