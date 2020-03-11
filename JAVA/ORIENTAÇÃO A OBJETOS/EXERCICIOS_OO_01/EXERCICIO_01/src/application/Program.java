package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// FAZER UM PROGRAMA PARA LER OS VALORES DA LARGURA E ALTURA DE UM RET�NGULO. EM SEGUIDA, MOSTRAR NA TELA O VALOR DE SUA �REA, PER�METRO
		// E DIAGONAL. USAR UMA CLASSE
		DecimalFormat df = new DecimalFormat ("#.##");
		Rectangle rectangle = new Rectangle();
		
		rectangle.base = Double.parseDouble(JOptionPane.showInputDialog("INFORME A BASE DO RET�NGULO"));
		rectangle.altura = Double.parseDouble(JOptionPane.showInputDialog("INFORME A ALTURA DO RET�NGULO"));
		
		
		JOptionPane.showMessageDialog(null, rectangle.toString());

	}

}
