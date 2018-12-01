package negocio;

import javax.swing.JOptionPane;

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
	
	public Disciplina adicionarDisciplina() {
		Disciplina disciplina = new Disciplina();
		disciplina.setCodDisciplina((Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina:"))));
        disciplina.setNomeDisciplina((JOptionPane.showInputDialog("Digite o nome da disciplina:")));
        return disciplina;
	}


}
