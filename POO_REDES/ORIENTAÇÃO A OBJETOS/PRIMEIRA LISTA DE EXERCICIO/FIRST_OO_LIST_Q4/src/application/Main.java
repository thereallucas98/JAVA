package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		int n = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE PRODUTOS QUE POSSUI NO SUPERMERCADO"));
		Product[] product = new Product[n];
		int cont = 1;
		for (int i = 0; i < n; i++) {
			String pname = JOptionPane.showInputDialog("INFORME O NOME " + cont + "º PRODUTO");
			int pamount = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANDITADE DESSE PRODUTO"));
			double pprice = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DESSE PRODUTO"));
			
			product[i] = new Product(pname, pamount, pprice);
			cont++;
		}
		String info = "";
		
		for (int j = 0; j < product.length; j++) {
			info = info +"\n" + product[j].toString();
		}
		
		JOptionPane.showMessageDialog(null, "PRODUTOS" + info);
		
		
	}

}
