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
		
		double areaX = x.area();
		double areaY = y.area();
		
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
