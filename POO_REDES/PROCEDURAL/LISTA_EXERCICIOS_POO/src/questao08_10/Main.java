package questao08_10;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// QUESTÃO 8 E 10
		// ESCREVA UM ALGORITMO PARA LER 2 VALORES E SE O SEGUNDO VALOR INFORMADO FOR ZERO, DEVE SER LIDO UM NOVO VALOR. 
		// EM SEGUIDA, DEVE SER REALIZADA A DIVISÃO.
		
		DecimalFormat df = new DecimalFormat("#.##");
		float valores[] = new float[2];
		float divisao;
		int count = 0;
		
		while(count < 2) {
			String entrada = JOptionPane.showInputDialog("Informe um valor");
			valores[count] = Float.parseFloat(entrada);
			
			if (valores[count] == 0) {
				String n_entrada = JOptionPane.showInputDialog("Número zero detectado, por favor informe um valor maior que zero");
				valores[count] = Float.parseFloat(n_entrada);
			}
			
			count += 1;
		}
		
		divisao = valores[0] / valores[1];
		JOptionPane.showMessageDialog(null, "O resultado entre "+valores[0]+" e "+valores[1]+" é igual a "+df.format(divisao));
	}
	

}