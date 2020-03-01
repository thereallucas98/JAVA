package questao11;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// ESCREVA UM PROGRAMA PARA LER AS NOTAS DA PRIMEIRA E SEGUNDA AVALIAÇÃO DE UM ALUNO, CALCULANDO E IMPRIMINDO A MÉDIA (SIMPLES). 
		// APENAS DEVE SER ACEITADO VALORES ENTRE 0 E 10.
		DecimalFormat df = new DecimalFormat("#.##");
		float n1, n2, media;
		
		String n1_entry = JOptionPane.showInputDialog("Informe a primeira nota");
		n1 = Float.parseFloat(n1_entry);
		if (n1<0 || n1>10) {
			String n1_retry = JOptionPane.showInputDialog("Informe a primeira nota entre os valores 0 e 10");
			n1 = Float.parseFloat(n1_retry);
		}
		
		String n2_entry = JOptionPane.showInputDialog("Informe a segunda nota");
		n2 = Float.parseFloat(n2_entry);
		if (n2<0 || n2>10) {
			String n2_retry = JOptionPane.showInputDialog("Informe a segunda nota entre os valores 0 e 10");
			n2 = Float.parseFloat(n2_retry);
		}
		
		media = (n1 + n2) / 2;
		
		JOptionPane.showMessageDialog(null, "Primeira avaliação: "+n1+"; Segunda avaliação: "+n2+"; MÉDIA: "+df.format(media));
		
	}

}
