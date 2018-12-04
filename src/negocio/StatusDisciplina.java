package negocio;

public class StatusDisciplina {

	public static String alunoAprovado(double numero1, double numero2) {
		if (numero1 > 7 || numero2 > 7) {
			return "Aprovado! ";
		}
		return "Reprovado! ";
	}
}
