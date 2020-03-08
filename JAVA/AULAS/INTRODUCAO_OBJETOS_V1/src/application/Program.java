package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("#.##");
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		x.a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xA"));
		x.b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xB"));
		x.c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xC"));
		y.a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yA"));
		y.b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yB"));
		y.c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yC"));
		
		double pX = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		double pY = (y.a+ y.b + y.c) / 2.0;
		double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		String infoy = "";
		String infox = "";
		infox = infox+"\nTRIANGLE X AREA "+df.format(areaX);
		infoy = infoy+"\nTRIANGLE Y AREA "+df.format(areaY);
		JOptionPane.showMessageDialog(null, infox+infoy);
		
		if(areaX > areaY) {
			JOptionPane.showMessageDialog(null, "MAIOR ÁREA: X");
		} else {
			JOptionPane.showMessageDialog(null, "MAIOR ÁREA: Y");
		}
		
	}

}
