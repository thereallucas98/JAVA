import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// QUEST�O 1 - FAZER UM PROGRAMA PARA LER UM N�MERO INTEIRO, E DEPOIS DIZER SE ESTE N�MERO � NEGATIVO OU N�O.
		/*int x;
		String xs;
		
		xs = JOptionPane.showInputDialog("Digite o valor de x: ");
		x = Integer.parseInt(xs);
		
		if (x > 0) {
			JOptionPane.showMessageDialog(null, "N�mero maior que zero, logo � positivo.");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero � menor que zero, logo � negativo.");
		}
		*/
		// QUEST�O 2 - FAZER UM PROGRAMA PARA LER UM N�MERO INTEIRO E DIZER SE ESTE N�MERO � PAR OU IMPAR
		/*int n, res;
		String ns;
		
		ns = JOptionPane.showInputDialog("Informe um n�mero inteiro qualquer: ");
		n = Integer.parseInt(ns);
		
		res = n % 2;
		
		if (res == 0) {
			JOptionPane.showConfirmDialog(null, "N�mero � par.");
		} else {
			JOptionPane.showConfirmDialog(null, "N�mero � impar.");
		}
		*/
		// QUEST�O 3 - LEIA 2 VALORES INTEIROS (A E B). AP�S, O PROGRAMA DEVE MOSTRAR UMA MENSAGEM "S�O MULTIPLOS" OU "N�O S�O MULTIPLOS
		// INDICANDO SE OS VALORES LIDOS S�O M�LTIPLOS ENTRE SI. 
		/*int a, b;
		String as, bs;
		
		as = JOptionPane.showInputDialog("Digite o valor de A: ");
		bs = JOptionPane.showInputDialog("Digite o valor de B: ");
		
		a = Integer.parseInt(as);
		b = Integer.parseInt(bs);
		
		if (a % 2 == 0 && b % 2 == 0) {
			JOptionPane.showMessageDialog(null, "S�o M�ltiplos entre si.");
		} else {
			JOptionPane.showMessageDialog(null, "N�o s�o M�ltiplos entre si.");
		}
		*/
		// QUEST�O 4 - LEIA A HORA INICIAL E A HORA FINAL DE UM JOGO. A SEGUIR CALCULE A DURA��O DO JOGO, SABENDO QUE O MESMO PODE COME�AR
		// EM UM DIA E TERMINAR EM OUTRO, TENDO UMA DURA��O M�NIMA DE 1 HORA E M�XIMA DE 24 HORAS.
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
