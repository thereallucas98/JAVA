package application;

import javax.swing.JOptionPane;

import entities.Agenda;
import entities.Contato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Informe o nome do dono da agenda");
		String numero = JOptionPane.showInputDialog("Informe o número do dono");
		Agenda ag1 = new Agenda(nome, numero);
		
		
		//JOptionPane.showMessageDialog(null, ag1.toString());
		
		while (true) {
			int answer = Integer.parseInt(JOptionPane.showInputDialog("Informe uma das opções abaixo: \n1. Adicionar contato\n2. Remover contato\n3. Ver lista de contatos\n0. Sair"));
			
			if (answer == 0) {
				JOptionPane.showMessageDialog(null, "ENCERRANDO PROGRAMA");
				break;
			} else if (answer == 1) {
				String c_nome = JOptionPane.showInputDialog("Informe o nome do novo contato");
				String c_numero = JOptionPane.showInputDialog("Informe o número do novo contato");
				Contato contato = new Contato(c_nome, c_numero);
				ag1.addcontato(contato);
			} else if (answer == 2) {
				if (ag1.getContatos().isEmpty() != true) {
					JOptionPane.showMessageDialog(null, ag1.getContatos());
					int position = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do elemento"));
					ag1.getContatos().remove(position-1);
					JOptionPane.showMessageDialog(null, "ELEMENTO REMOVIDO");
				} else {
					JOptionPane.showMessageDialog(null, "AGENDA ESTÁ VAZIA!");
				}
			} else if (answer == 3) {
				JOptionPane.showMessageDialog(null, ag1.toString());
			}
		}
	}

}
