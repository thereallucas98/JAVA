package application;

import javax.swing.JOptionPane;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		// FAZER UM PROGRAMA PARA LER OS DADOS DE UM FUNCION�RIO (NOME, SAL�RIO BRUTO E IMPOSTO). 
		// EM SEGUIDA, MOSTRAR OS DADOS DO FUNCION�RIO (NOME E SAL�RIO L�QUIDO).
		// EM SEGUIDA, AUMENTAR O SAL�RIO DO FUNCION�RIO COM BASE EM UMA PORCENTAGEM DADA (SOME O SAL�RIO BRUTO � AFETADO PELA PORCENTAGEM).
		// E MOSTRAR NOVAMENTE OS DADOS DO FUNCION�RIO.
		Empregado empregado = new Empregado();
		String Aumento;
		Double aumento;
		empregado.nome = JOptionPane.showInputDialog("INFORME O NOME DO EMPREGADO: ");
		empregado.salario = Double.parseDouble(JOptionPane.showInputDialog("INFORME O SAL�RIO DO EMPREGADO"));
		empregado.imposto = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR PAGO DE IMPOSTO"));
		
		JOptionPane.showMessageDialog(null, empregado.toString());
		
		Aumento = JOptionPane.showInputDialog("INFORME O AUMENTO DO EMPREGADO - ENTRE 0 E 100");
		aumento = Double.parseDouble(Aumento);
		empregado.Aumento(aumento);
		
		JOptionPane.showMessageDialog(null, "UPDATE\n" + empregado.toString());

	}

}
