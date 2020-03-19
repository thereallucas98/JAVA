package application;

import javax.swing.JOptionPane;

import entities.Lampada;
import entities.LampadaTresEstados;

public class Main {
	// CRIAR UMA CLASSE PARA REPRESENTAR UMA LAMPADA.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LampadaTresEstados estados = new LampadaTresEstados("OFF", "OFF", "OFF");
		Lampada lampada = new Lampada(estados);
		while (true) {
			JOptionPane.showMessageDialog(null, lampada.toString());
			int answer = Integer.parseInt(JOptionPane.showInputDialog("DESEJA CONTINUAR? [1. PARAR PROGRAMA - 2. CONTINUA PROGRAMA]"));
			if ( answer == 1) {
				break;
			} else {
				
				int op = Integer.parseInt(JOptionPane.showInputDialog("INFORME UMA DAS OPÇÕES ABAIXO: \n1. ACENDER A LÂMPADA\n2. DEIXAR MEIA LUZ\n3. DEIXAR APAGADA\n0. FINALIZAR PROGRAMA"));
				
				switch(op) {
				case 1:
					lampada.getLampadaTresEstados().setAcessa("ON");
					lampada.getLampadaTresEstados().setApagada("OFF");
					lampada.getLampadaTresEstados().setMeiaLuz("OFF");
					break;
				case 2: 
					lampada.getLampadaTresEstados().setAcessa("OFF");
					lampada.getLampadaTresEstados().setApagada("OFF");
					lampada.getLampadaTresEstados().setMeiaLuz("ON");
					
					break;
				case 3: 
					lampada.getLampadaTresEstados().setAcessa("OFF");
					lampada.getLampadaTresEstados().setApagada("ON");
					lampada.getLampadaTresEstados().setMeiaLuz("OFF");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "SAINDO DO PROGRAMA");
					answer = 1;
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
					break;
				}
				JOptionPane.showMessageDialog(null, lampada.toString());
			}
			
		}
	}

}
