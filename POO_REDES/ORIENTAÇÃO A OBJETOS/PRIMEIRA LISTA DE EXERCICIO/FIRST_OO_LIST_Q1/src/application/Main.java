package application;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Endereco;

public class Main {
	// CRIAR UMA CLASSE DE ALUNO COM NOME, MATR�CULA, ENDERE�O E CPF. EXIBINDO AS INFORMA��ES ATRAV�S DO M�TODO TOSTRING()
	public static void main(String[] args) {
		Endereco endA = new Endereco("ABC", 123, "NOVO MIL�NIO", "JO�O PESSOA", "PARA�BA", "58068083");
		Aluno a1 = new Aluno("DAVID LUCAS", endA, 201713, "703.612.414-88");
		
		JOptionPane.showMessageDialog(null, a1.toString());

	}

}
