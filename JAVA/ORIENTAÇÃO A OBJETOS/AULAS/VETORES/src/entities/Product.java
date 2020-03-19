package entities;

public class Product {
	private String name;
	private double price;
	
	public Product(String nome, double preco) {
		this.name = nome;
		this.price = preco;
	}
	
	public double getPrice() {
		return price;
	}
}
