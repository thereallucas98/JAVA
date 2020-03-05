package oo_sem_classe;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Oo {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("#.##");
		double xA, xB, xC, yA, yB, yC;
		
		xA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xA"));
		xB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xB"));
		xC = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de xC"));
		yA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yA"));
		yB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yB"));
		yC = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de yC"));
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		double pY = (yA+ yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
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
