package questao03_04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// ESCREVA UM ALGORITMO PARA RECEBER UM VALOR E DETERMINAR SE ELE É POSITIVO OU NEGATIVO E, SE É MENOR OU MAIOR QUE 10.
		int x;
		String X;
		
		X = JOptionPane.showInputDialog("Informe um número inteiro qualquer");
		x = Integer.parseInt(X);
		
		if (x < 0) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" é negativo e também menor que 10!");
		} else if (x > 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" é positivo e também maior que 10!");
		} else if ( x == 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" é igual a 10!");
		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" é positivo, porém menor que o valor 10!");
		}

	}

}
