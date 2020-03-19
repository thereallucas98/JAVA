package entities;

public class Client {
	// DECLARAÇÃO
	private String nomec;
	private String cpf;
	private Product produto;
	// CONSTRUTOR
	public Client(String cname, String ccpf, Product nproduct) {
		this.nomec = cname;
		this.cpf = ccpf;
		this.produto = nproduct;
	}
	// GET E SET
	public void setNome(String nNome) {
		this.nomec = nNome;
	}
	public void setCPF(String nCPF) {
		this.cpf = nCPF;
	}
	public void setProduto(Product nProduto) {
		this.produto = nProduto;
	}
	
	public String getNome() {
		return this.nomec;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public Product getProduct() {
		return this.produto;
	}
	
	// MÉTODO
	
}
