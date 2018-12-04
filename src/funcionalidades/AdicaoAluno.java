package funcionalidades;

import java.util.ArrayList;
import negocio.Aluno;
import ui.Telas;

public class AdicaoAluno {

	private ArrayList<Aluno> alunos;	
	private Telas tela;
	
	public AdicaoAluno() {
		alunos = new ArrayList<Aluno>();
		tela = new Telas();
	}
	
	public void adicionaAluno() {
		alunos.add(new Aluno(alunos.size() + 1, tela.getTelaAdicionaAluno()));
	}
}
