package questao03_04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// ESCREVA UM ALGORITMO PARA RECEBER UM VALOR E DETERMINAR SE ELE � POSITIVO OU NEGATIVO E, SE � MENOR OU MAIOR QUE 10.
		int x;
		String X;
		
		X = JOptionPane.showInputDialog("Informe um n�mero inteiro qualquer");
		x = Integer.parseInt(X);
		
		if (x < 0) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" � negativo e tamb�m menor que 10!");
		} else if (x > 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" � positivo e tamb�m maior que 10!");
		} else if ( x == 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" � igual a 10!");
		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado "+x+" � positivo, por�m menor que o valor 10!");
		}

	}

}
