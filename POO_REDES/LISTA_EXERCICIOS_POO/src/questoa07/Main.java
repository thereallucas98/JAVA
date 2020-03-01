package questoa07;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// QUESTÃO 7 E 9
		// ESCREVA UM ALGORITMO PARA LER 2 VALORES E SE O SEGUNDO VALOR INFORMADO FOR ZERO, DEVE SER LIDO UM NOVO VALOR. 
		// EM SEGUIDA, DEVE SER REALIZADA A DIVISÃO.
		
		DecimalFormat df = new DecimalFormat("#.##");
		float valores[] = new float[2];
		float divisao;
		for (int i = 0; i < 2; i++) {
			String entrada = JOptionPane.showInputDialog("Informe a "+(i+1)+"a. nota");
			valores[i] = Float.parseFloat(entrada);
			
			if (valores[i] == 0) {
				
				String n_entrada = JOptionPane.showInputDialog("Valor zero detectado. Informe a "+(i+1)+"a. nota");
				valores[i] = Float.parseFloat(n_entrada);
			}
		}
		
		divisao = valores[0] / valores[1];
		JOptionPane.showMessageDialog(null, "O resultado entre "+valores[0]+" e "+valores[1]+" é igual a "+df.format(divisao));
	}
	

}
