package application;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class Main {
	// CRIAR UMA CLASSE FUNCION�RIO E OBTER INFORMA��ES COM  O NOME, DEPARTAMENTO, SAL�RIO, DATA DE ADIMISS�O E RG.
	// ELABORAR UM M�TODO PARA RECEBER AUMENTO E MOSTRAR QUANTO GANHA EM 12 MESES.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario("DAVID LUCAS", "SUPORTE T�CNICO EM REDES", 1050, "17/08/2019", "1234");
		
		JOptionPane.showMessageDialog(null, f1);
		f1.Aumento(10);
		JOptionPane.showMessageDialog(null, "ATUALIZA��O\n" + f1);
	}

}
