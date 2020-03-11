package entities;

public class Empregado {
	public String nome;
	public double salario;
	public double imposto;
	
	// SALARIO
	public double SaLiquido() {
		return salario - imposto;
	}
	// AUMENTO
	public void Aumento(double percentage) {
		salario += salario * percentage / 100;
	}
	
	public String toString() {
		return "NOME: " + nome
			   + "\nSALÁRIO: $ "
			   + String.format("%.2f",SaLiquido());
	}
}
