package application;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		Calculator calc = new Calculator();
		double radius = Double.parseDouble(JOptionPane.showInputDialog("ENTER RADIUS"));
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		JOptionPane.showMessageDialog(null, "RESULTADO: \n" + "CIRCUNFERÊNCIA: " + df.format(c) + "\nVOLUME: " + df.format(v));
	}

}
