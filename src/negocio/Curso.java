package negocio;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Avaliacao> avaliacoes;
	
	public Curso() {
		avaliacoes = new ArrayList<Avaliacao>();
	}
	
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
}
