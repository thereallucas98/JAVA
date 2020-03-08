package questao05;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// AS MA��S CUSTAM R$1.30 CADA SE FOREM COMPRADAS MENOS DE UMA D�ZIA, E R$1.00 SE FOREM COMPRADAS PELO MENOS 12.
		// ESCREVA UM PROGRAMA QUE LEIA O N�MERO DE MA��S COMPRADAS, CALCULE E ESCREVA O CUSTO TOTAL DA COMPRA.
		DecimalFormat df = new DecimalFormat("#.##");
		int qtd = 0;
		float tot;
		String Amount;
		
		Amount = JOptionPane.showInputDialog("Informe a quantidade de ma��s compradas");
		
		qtd = Integer.parseInt(Amount);
		
		if (qtd >= 12) {
			tot = qtd * 1.00f;
			JOptionPane.showMessageDialog(null, "Voc� ter� de pagar "+df.format(tot)+" pelas "+qtd+" de ma��s compradas.");
			
		} else {
			tot = qtd * 1.30f;
			JOptionPane.showMessageDialog(null, "Voc� ter� de pagar "+df.format(tot)+" pelas "+qtd+" de ma��s compradas.");
		}
	}

}
