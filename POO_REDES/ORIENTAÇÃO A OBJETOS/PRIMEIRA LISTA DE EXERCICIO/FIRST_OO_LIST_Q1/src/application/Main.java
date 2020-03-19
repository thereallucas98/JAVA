package application;

import javax.swing.JOptionPane;

import entities.Aluno;
import entities.Endereco;

public class Main {
	// CRIAR UMA CLASSE DE ALUNO COM NOME, MATRÍCULA, ENDEREÇO E CPF. EXIBINDO AS INFORMAÇÕES ATRAVÉS DO MÉTODO TOSTRING()
	public static void main(String[] args) {
		Endereco endA = new Endereco("ABC", 123, "NOVO MILÊNIO", "JOÃO PESSOA", "PARAÍBA", "58068083");
		Aluno a1 = new Aluno("DAVID LUCAS", endA, 201713, "703.612.414-88");
		
		JOptionPane.showMessageDialog(null, a1.toString());

	}

}
