package ui;

import javax.swing.JOptionPane;


public class TelasErro {
	
	public static void getTelaErro(String mensagemErro) {
		mensagemErro = "Op��o Inv�lida! ";
		JOptionPane.showMessageDialog(null, mensagemErro);
	}
	
	public static void getTelaErroAlunoNaoCadastrado() {
		String mensagem = "N�o h� aluno para lan�amento de notas. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static void getTelaErroDisciplinaNaoCadastrada() {
		String mensagem = "N�o h� disciplina para lan�amento de notas. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static void getTelaErroBoletim() {
		String mensagem = "N�o h� boletins a serem listados. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
