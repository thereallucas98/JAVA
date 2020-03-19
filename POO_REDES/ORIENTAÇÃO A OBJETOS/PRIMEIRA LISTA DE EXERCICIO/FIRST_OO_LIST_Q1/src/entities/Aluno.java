package entities;

public class Aluno {
	// DECLARAÇÃO
	private String nome;
	private Endereco endereco; // COMPOSIÇÃO
	private int matricula;
	private String cpf;
	
	// CONSTRUTOR
	public Aluno(String name, Endereco address, int code, String identity) {
		this.nome = name;
		this.endereco = address;
		this.matricula = code;
		this.cpf = identity;
	}
	
	// RETURN
	public String toString() {
		return "DADOS DO ALUNO\n"
				+ "\nNOME: " + this.nome + " - CPF: " + this.cpf
				+ "\nENDEREÇO: "
				+ this.endereco
				+ "\nMATRICULA: " + this.matricula
				+ "\n";
 	}
	
	
}
