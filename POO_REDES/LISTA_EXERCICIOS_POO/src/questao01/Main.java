package questao01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// FA�A UM ALGORITMO QUE LEIA A IDADE DE UMA PESSOA, EXPRESSA EM ANOS. EM SEGUIDA, MOSTRE A IDADE EXPRESSA APENAS EM DIAS.
		int anos, idade;
		String Anos;
		
		Anos = JOptionPane.showInputDialog("Informe quantos anos voc� tem");
		anos = Integer.parseInt(Anos);
		idade = anos * 365;
		JOptionPane.showMessageDialog(null, "Voc� tem ao total, "+idade+" dias de idade");
	}

}
