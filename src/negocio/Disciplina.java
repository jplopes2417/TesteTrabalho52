package negocio;

import java.util.List;

public class Disciplina {

	private int codDisciplina;
	private String nomeDisciplina;

	public Disciplina() {

	}

	public Disciplina(int codDisciplina, String nomeDisciplina) {

		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;

	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;

	}

	public static Disciplina getDisciplinaPorCodigo(List<Disciplina> disciplinas, int codigoDisciplina) {
		Disciplina disciplinaRetorno = disciplinas.stream().filter(d -> codigoDisciplina == (d.getCodDisciplina()))
				.findAny().orElse(null);
		return disciplinaRetorno;
	}

}
