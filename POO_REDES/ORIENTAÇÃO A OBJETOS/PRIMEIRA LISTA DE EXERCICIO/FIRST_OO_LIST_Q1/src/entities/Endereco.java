package entities;

public class Endereco {
	// DECLARAÇÃO
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	// CONSTRUTOR
	public Endereco(String street, int number, String neigh, String city, String state, String codecep) {
		this.rua = street;
		this.numero = number;
		this.bairro = neigh;
		this.cidade = city;
		this.estado = state;
		this.cep = codecep;
	}
	
	// RETURN
	public String toString() {
		return "\nRUA: " + this.rua + " Nº" + this.numero + " - " + this.bairro + " - " + this.cidade + "/" + this.estado + " - " + this.cep;
	}
	
	
}
