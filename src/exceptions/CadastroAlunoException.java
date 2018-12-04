package exceptions;

import ui.Telas;

public class CadastroAlunoException extends Exception {

	public CadastroAlunoException(String mensagemErro, Telas tela) {
		super.printStackTrace();
		tela.getTelaErro(mensagemErro);
	}

	}

