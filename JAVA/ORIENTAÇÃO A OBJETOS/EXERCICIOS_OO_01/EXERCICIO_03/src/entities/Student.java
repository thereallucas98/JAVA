package entities;

public class Student {
	public double nota1;
	public double nota2;
	public double nota3; 
	
	public double NotaFinal() {
		return (nota1 + nota2 + nota3) / 3.0;
	}
	
	public String Resultado() {
		if (NotaFinal() > 70) {
			return "APROVADO COM M�DIA: " + NotaFinal();
		} else if (NotaFinal() > 40 || NotaFinal() < 69) {
			return "RECUPERA��O COM M�DIA: " + NotaFinal();
		} else if (NotaFinal() < 39) {
			return "REPROVADO COM M�DIA: " + NotaFinal();
		} else {
			return "DADOS INV�LIDOS";
		}
	}
}
