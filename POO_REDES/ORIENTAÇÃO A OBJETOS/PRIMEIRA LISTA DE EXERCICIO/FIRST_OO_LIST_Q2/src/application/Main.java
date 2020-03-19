package application;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class Main {
	// CRIAR UMA CLASSE FUNCIONÁRIO E OBTER INFORMAÇÕES COM  O NOME, DEPARTAMENTO, SALÁRIO, DATA DE ADIMISSÃO E RG.
	// ELABORAR UM MÉTODO PARA RECEBER AUMENTO E MOSTRAR QUANTO GANHA EM 12 MESES.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario("DAVID LUCAS", "SUPORTE TÉCNICO EM REDES", 1050, "17/08/2019", "1234");
		
		JOptionPane.showMessageDialog(null, f1);
		f1.Aumento(10);
		JOptionPane.showMessageDialog(null, "ATUALIZAÇÃO\n" + f1);
	}

}
