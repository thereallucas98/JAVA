import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// QUESTÃO 1 - FAZER UM PROGRAMA PARA LER UM NÚMERO INTEIRO, E DEPOIS DIZER SE ESTE NÚMERO É NEGATIVO OU NÃO.
		/*int x;
		String xs;
		
		xs = JOptionPane.showInputDialog("Digite o valor de x: ");
		x = Integer.parseInt(xs);
		
		if (x > 0) {
			JOptionPane.showMessageDialog(null, "Número maior que zero, logo é positivo.");
		} else {
			JOptionPane.showMessageDialog(null, "Número é menor que zero, logo é negativo.");
		}
		*/
		// QUESTÃO 2 - FAZER UM PROGRAMA PARA LER UM NÚMERO INTEIRO E DIZER SE ESTE NÚMERO É PAR OU IMPAR
		/*int n, res;
		String ns;
		
		ns = JOptionPane.showInputDialog("Informe um número inteiro qualquer: ");
		n = Integer.parseInt(ns);
		
		res = n % 2;
		
		if (res == 0) {
			JOptionPane.showConfirmDialog(null, "Número é par.");
		} else {
			JOptionPane.showConfirmDialog(null, "Número é impar.");
		}
		*/
		// QUESTÃO 3 - LEIA 2 VALORES INTEIROS (A E B). APÓS, O PROGRAMA DEVE MOSTRAR UMA MENSAGEM "SÃO MULTIPLOS" OU "NÃO SÃO MULTIPLOS
		// INDICANDO SE OS VALORES LIDOS SÃO MÚLTIPLOS ENTRE SI. 
		/*int a, b;
		String as, bs;
		
		as = JOptionPane.showInputDialog("Digite o valor de A: ");
		bs = JOptionPane.showInputDialog("Digite o valor de B: ");
		
		a = Integer.parseInt(as);
		b = Integer.parseInt(bs);
		
		if (a % 2 == 0 && b % 2 == 0) {
			JOptionPane.showMessageDialog(null, "São Múltiplos entre si.");
		} else {
			JOptionPane.showMessageDialog(null, "Não são Múltiplos entre si.");
		}
		*/
		// QUESTÃO 4 - LEIA A HORA INICIAL E A HORA FINAL DE UM JOGO. A SEGUIR CALCULE A DURAÇÃO DO JOGO, SABENDO QUE O MESMO PODE COMEÇAR
		// EM UM DIA E TERMINAR EM OUTRO, TENDO UMA DURAÇÃO MÍNIMA DE 1 HORA E MÁXIMA DE 24 HORAS.
		int hi, hf, duracao;
		String his, hfs;
		
		his = JOptionPane.showInputDialog("Informe a hora inicial do jogo: ");
		hfs = JOptionPane.showInputDialog("Informe a hora final do jogo: ");
		
		hi = Integer.parseInt(his);
		hf = Integer.parseInt(hfs);
		
		if (hi < hf) {
			duracao = hf - hi;
		} else {
			duracao = 24 - hi + hf;
		}
		
		JOptionPane.showMessageDialog(null, "O jogo durou " + duracao + " HORA(S).");
		
	}

}
