package questao06;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {
	public static float Media(float n1, float n2, float n3) {
		return ((n1 * 4) + (n2 * 3) + (n3 * 3)) / (4 + 3 + 3);
	}

	public static void main(String[] args) {
		// ESCREVA UM ALGORITMO PARA LER TRÊS NOTAS (PESO 4 PARA UMA E 3 PARA OUTRAS DUAS NOTAS). 
		// MOSTRE UMA MENSAGEM, APÓS REALIZAR O CALCULO, SE ELE FOI APROVADO RES >= 5 E REPROVADO CASO NÃO ATINGA A MÉDIA NECESSÁRIA.
		DecimalFormat df = new DecimalFormat("#.##");
		float notas[] = new float[3];
		float media;
		
		for (int i = 0; i < notas.length; i++) {
			String entrada = JOptionPane.showInputDialog("Informe a "+(i+1)+"a. nota");
			notas[i] = Float.parseFloat(entrada);
		}
		media = Media(notas[0], notas[1], notas[2]);
		JOptionPane.showMessageDialog(null, "A média com os pesos de 4 para a primeira nota e 3 para as restantes resulta em uma média de "+df.format(media));

	}

}
