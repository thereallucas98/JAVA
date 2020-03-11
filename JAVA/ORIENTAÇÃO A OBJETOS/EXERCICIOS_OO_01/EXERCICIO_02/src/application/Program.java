package application;

import javax.swing.JOptionPane;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		// FAZER UM PROGRAMA PARA LER OS DADOS DE UM FUNCIONÁRIO (NOME, SALÁRIO BRUTO E IMPOSTO). 
		// EM SEGUIDA, MOSTRAR OS DADOS DO FUNCIONÁRIO (NOME E SALÁRIO LÍQUIDO).
		// EM SEGUIDA, AUMENTAR O SALÁRIO DO FUNCIONÁRIO COM BASE EM UMA PORCENTAGEM DADA (SOME O SALÁRIO BRUTO É AFETADO PELA PORCENTAGEM).
		// E MOSTRAR NOVAMENTE OS DADOS DO FUNCIONÁRIO.
		Empregado empregado = new Empregado();
		String Aumento;
		Double aumento;
		empregado.nome = JOptionPane.showInputDialog("INFORME O NOME DO EMPREGADO: ");
		empregado.salario = Double.parseDouble(JOptionPane.showInputDialog("INFORME O SALÁRIO DO EMPREGADO"));
		empregado.imposto = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR PAGO DE IMPOSTO"));
		
		JOptionPane.showMessageDialog(null, empregado.toString());
		
		Aumento = JOptionPane.showInputDialog("INFORME O AUMENTO DO EMPREGADO - ENTRE 0 E 100");
		aumento = Double.parseDouble(Aumento);
		empregado.Aumento(aumento);
		
		JOptionPane.showMessageDialog(null, "UPDATE\n" + empregado.toString());

	}

}
