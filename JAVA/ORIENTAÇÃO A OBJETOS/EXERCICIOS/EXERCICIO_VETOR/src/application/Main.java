package application;

import javax.swing.JOptionPane;

import entities.Hotel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel[] rent = new Hotel[10];
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos quartos serão alugados 1 a 10?"));
		
		for (int i = 0; i < n; i++) {
			String nome = JOptionPane.showInputDialog("RENT # " + i + "\nINFORME O NOME DA PESSOA: ");
			String email = JOptionPane.showInputDialog("Informe o EMAIL: ");
			int room = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do quarto: "));
			
			rent[room] = new Hotel(nome, email);
		}
		String info = "";
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				info = info + "\nBUSY ROOM "+ i + "\n" + rent[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, info);
	}

}
