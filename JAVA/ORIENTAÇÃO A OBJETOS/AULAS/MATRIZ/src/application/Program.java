package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Tamanho da Matriz"));
		
		int [][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				int value = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor na posição: " + "LINHA: " + i + " - COLUNA: " + j));
				mat[i][j] = value;
			}
		}
		JOptionPane.showMessageDialog(null, "MAIN DIAGONAL");
		String info = "";
		for (int i = 0; i < mat.length; i++) {
			info = info + mat[i][i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, info);
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		

		JOptionPane.showMessageDialog(null, "NEGATIVE NUMBERS: " + count);
		
	}

}
