package negocio;

public class StatusDisciplina {

	public static String AlunoAprovado(double numero1, double numero2) {
		String mensagem = "";
		if (numero1 > 7 || numero2 > 7) {
			mensagem = "Aprovado! ";
			return mensagem;
		} else mensagem = "Reprovado! ";
		return mensagem;
	}
	
}
