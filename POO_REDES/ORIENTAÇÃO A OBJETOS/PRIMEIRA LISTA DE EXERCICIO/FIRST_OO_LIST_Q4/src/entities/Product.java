package entities;

public class Product {
	// DECLARAÇÃO
	private String nomep;
	private int quantidadep;
	private double precop;
	// CONSTRUTOR
	public Product(String pname, int pamount, double pprice) {
		this.nomep = pname;
		this.quantidadep = pamount;
		this.precop = pprice;
	}
	// GET E SET
	public void setNome(String nName) {
		this.nomep = nName;
	}
	public void setQuantidade(int nQuantidade) {
		this.quantidadep = nQuantidade;
	}
	public void setPreco(double nPreco) {
		this.precop = nPreco;
	}
	
	public String getNome() {
		return this.nomep;
	}
	
	public int getQuantidade() {
		return this.quantidadep;
	}
	
	public double getPreco() {
		return this.precop;
	}
	
	// MÉTODOS
	
	// RETURN
	public String toString() {
		return "NOME: " + this.nomep + " PREÇO: " + this.precop + " QUANTIDADE: " + this.quantidadep;
	}
}
