package entities;

public class Funcionario {
	// DECLARAÇÃO
	String nome;
	String departamento;
	double salario;
	String entrada;
	String rg;
	
	// CONSTRUTOR
	public Funcionario(String name, String sector, double salary, String entrace, String identity) {
		this.nome = name;
		this.departamento = sector;
		this.salario = salary;
		this.entrada = entrace;
		this.rg = identity;
	}
	
	// MÉTODOS
	public void Aumento(double percentage) {
		this.salario += this.salario * percentage / 100;
	}
	// RETURN 
	public String toString() {
		return "DADOS DO FUNCIONÁRIO"
				+ "\nNOME: " + this.nome + " - RG: " + this.rg
				+ "\nDATA DE ADMISSÃO: " + this.entrada + " - DEPARTAMENTO: " + this.departamento + " SALÁRIO ATUAL: R$" + this.salario; 
	}
	
}
