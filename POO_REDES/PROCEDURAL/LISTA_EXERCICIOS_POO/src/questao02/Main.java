package questao02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// ESCREVA UM ALGORITMO PARA LER AS DIMENSOES DE UM RETANGULO (BASE E ALTURA), CALCULAR E ESCREVER A AREA DO RETANGULO.
		float area, base, altura;
		String Base, Altura;
		
		Base = JOptionPane.showInputDialog("Informe a BASE do ret�ngulo");
		Altura = JOptionPane.showInputDialog("Informe a ALTURA do ret�ngulo");
		base = Float.parseFloat(Base);
		altura = Float.parseFloat(Altura);
		
		area = base * altura;
		
		JOptionPane.showMessageDialog(null, "O resultado entre "+base+" * "+altura+" � igual a "+area+" cm/m quadrado");

	}

}
