package questao15;

import javax.swing.JOptionPane;

public class Main {
	
	public static String contadorEstoque(int qtd[]) {
		int soma = 0;
		for (int i = 0; i < qtd.length; i++) {
			soma += qtd[i];
		}
		
		return ("A empresa possui um total de "+soma+"itens no estoque!");
	}

	public static void main(String[] args) {
		String[] nomes;
		float preco[];
		int quantidadeEstoque[];
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
		
		nomes = new String[n];
		preco = new float[n];
		quantidadeEstoque = new int[n];
		
		for(int i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome do produto");
			preco[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco do produto"));
			quantidadeEstoque[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desse produto"));
		}
		String info = "";
		
		for (int j = 0; j < nomes.length; j++) {
			info = info+"\nPRODUTO: "+nomes[j]+" - VALOR: "+preco[j]+" - QUANTIDADE: "+quantidadeEstoque[j];
		}
		String retorno = contadorEstoque(quantidadeEstoque);
		JOptionPane.showMessageDialog(null, retorno+info);
	}

}

