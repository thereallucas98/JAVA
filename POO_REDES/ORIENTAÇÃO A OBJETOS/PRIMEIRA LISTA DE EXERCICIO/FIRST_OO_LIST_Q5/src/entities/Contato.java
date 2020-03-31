package entities;

public class Contato {
	private String nome;
	private String numero;
	
	// CONSTRUCTOR
	public Contato() {
	}
	
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + " - N�mero: " + numero;
	}
	
	
}
