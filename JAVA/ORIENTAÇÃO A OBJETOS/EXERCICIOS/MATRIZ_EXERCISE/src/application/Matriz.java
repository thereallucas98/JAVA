package application;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de Linhas"));
		
		int[][] mat = new int[m][n];
		
		// CONSTRUINDO A MATRIZ
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int value = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor na posição: " + "LINHA: " + i + "- COLUNA: " + j));
				mat[i][j] = value;
			}
		}
		
		String info = "";
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				info = info + mat[i][j] + " ";
			}
			info = info + "\n";

		}
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(info + "\nInforme um número dentro da matriz"));
		String info2 = "";
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					info2 = info2 + "\nPosição\nLINHA: " + i +  " COLUNA: " + j;
					if (j > 0) {
						info2 = info2 + "\nLEFT: " + mat[i][j-1];
					}
					if (i > 0) {
						info2 = info2 + "\nUP: " + mat[i-1][j];
					}
					if (j < mat[i].length-1) {
						info2 = info2 + "\nRIGHT: " + mat[i][j+1];
					}
					if (i < mat.length-1) {
						info2 = info2 + "\nDOWN: " + mat[i+1][j];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, info2);
	}
	


}
