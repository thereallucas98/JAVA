package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantityA) {
		this.quantity += quantityA;
	}
	
	public void removeProducts(int quantityR) {
		this.quantity -= quantityR;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, TOTAL: $ "
			+ String.format("%.2f", totalValueInStock());
			
	}
}

