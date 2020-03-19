package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// GET & SET
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setId(Integer nId) {
		this.id = nId;
	}
	
	public void setName(String nName) {
		this.name = nName;
	}
	
	public void setSalary(Double nSalary) {
		this.salary = nSalary;
	}
	
	// MÉTODOS
	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage / 100;
	}
	// RETURN
	public String toString() {
		return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
	}
}
