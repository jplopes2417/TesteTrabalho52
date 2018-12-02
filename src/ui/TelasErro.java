package ui;

import javax.swing.JOptionPane;


public class TelasErro {
	
	public static void getTelaErro(String mensagemErro) {
		mensagemErro = "Opção Inválida! ";
		JOptionPane.showMessageDialog(null, mensagemErro);
	}
	
	public static void getTelaErroAlunoNaoCadastrado() {
		String mensagem = "Não há aluno para lançamento de notas. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static void getTelaErroDisciplinaNaoCadastrada() {
		String mensagem = "Não há disciplina para lançamento de notas. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static void getTelaErroBoletim() {
		String mensagem = "Não há boletins a serem listados. ";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
