package application;

import javax.swing.JOptionPane;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// FAZER UM PROGRAMA PARA LER O NOME DE UM ALUNO E AS TR�S NOTAS QUE ELE OBTEVE NOS 4 BIMESTRES DO ANO. VALENDO DE 0 - 100. 
		// AO FINAL, MOSTRAR QUAL A NOTA FINAL DO ALUNO.
		// INFORMAR SE ELE FOI APROVADO (MAIOR QUE 70), SE IR� PRA RECUPERA��O (40 E 69) E REPROVADO (MENOR QUE 39).
		Student estudante = new Student();
		
		estudante.nota1 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A PRIMEIRA NOTA: "));
		estudante.nota2 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A SEGUNDA NOTA: "));
		estudante.nota3 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A TERCEIRA NOTA: "));
		
		JOptionPane.showMessageDialog(null, estudante.Resultado());
;	}

}
