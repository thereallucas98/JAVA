package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		int n = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE PRODUTOS"));
		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			String nome = JOptionPane.showInputDialog("INFORME O NOME DO PRODUTO");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO PRODUTO"));
			
			vect[i] = new Product(nome, preco);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		JOptionPane.showMessageDialog(null, "MÉDIA: " + df.format(avg));
	}

}
