package entities;

public class Funcionario {
	// DECLARA��O
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
	
	// M�TODOS
	public void Aumento(double percentage) {
		this.salario += this.salario * percentage / 100;
	}
	// RETURN 
	public String toString() {
		return "DADOS DO FUNCION�RIO"
				+ "\nNOME: " + this.nome + " - RG: " + this.rg
				+ "\nDATA DE ADMISS�O: " + this.entrada + " - DEPARTAMENTO: " + this.departamento + " SAL�RIO ATUAL: R$" + this.salario; 
	}
	
}
