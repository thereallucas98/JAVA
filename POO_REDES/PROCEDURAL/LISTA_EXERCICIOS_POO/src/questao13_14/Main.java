package questao13_14;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// ESCREVA UM ALGORITMO QUE ESCREVA EM ORDEM CRESCENTE E DECRESCENTE DE 1 A 10 E QUE TAMBÉM RECEBA 10 VALORES E INFORME O SOMATÓRIO.
		DecimalFormat df = new DecimalFormat("#.##");
		float valores[] = new float[10];
		float somatorio = 0;
		
		System.out.println("ORDEM CRESCENTE");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("ORDEM DECRESCENTE");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i < valores.length; i++) {
			String entrada = JOptionPane.showInputDialog("Informe o "+(i+1)+"o. valor");
			valores[i] = Float.parseFloat(entrada);
			somatorio += valores[i];
		}
		
		JOptionPane.showMessageDialog(null, "O somatório dos valores informados é: "+somatorio);
		
	}

}
