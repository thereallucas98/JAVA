package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("#.##");
		Product product = new Product();
		
		product.name = JOptionPane.showInputDialog("Informe o nome do produto");
		product.price = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto"));
		product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
				
		//JOptionPane.showMessageDialog(null, "\nNOME DO PRODUTO: "+product.name+"\nPREÇO DO PRODUTO: "+df.format(product.price)+"\nQUANTIDADE DO PRODUTO: "+product.quantity);
		
		
		
		JOptionPane.showMessageDialog(null, "Product data: "+product.toString());
		
		int quantityA = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova quantidade a ser adicionada ao produto"));
		product.addProducts(quantityA);
		
		JOptionPane.showMessageDialog(null, "Updated data: "+product.toString());
		
		int quantityR = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova quantidade a ser removido"));
		product.removeProducts(quantityR);
		
		JOptionPane.showMessageDialog(null, "Updated data: "+product.toString());
	}

}
