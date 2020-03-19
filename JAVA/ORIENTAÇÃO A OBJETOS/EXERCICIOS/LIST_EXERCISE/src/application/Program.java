package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de empregados que serão registrados"));
		
		for (int i = 1; i <= n; i++) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Empregado #" + i + "\nInforme o ID"));
			String name = JOptionPane.showInputDialog("Informe o nome do empregado");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do empregado"));
			
			list.add(new Employee(id, name, salario));
		}
		
		// PART 2 - UPDATING SALARY OF GIVIN EMPLOYEE
		int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do empregado que terá aumento"));
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			JOptionPane.showMessageDialog(null, "ID inexistente");
		} else {
			double percentage = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do aumento"));
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES
		String info = "";
		for (Employee obj : list) {
			info = info + "\n" + obj;
		}
		
		JOptionPane.showMessageDialog(null, "LISTANDO EMPREGADOS\n" + info);
		
	}

}
