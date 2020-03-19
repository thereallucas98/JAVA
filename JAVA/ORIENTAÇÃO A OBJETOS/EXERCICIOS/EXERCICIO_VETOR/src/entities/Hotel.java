package entities;

public class Hotel {
	private String name;
	private String email;
	
	public Hotel(String nome, String email) {
		this.name = nome;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String nName) {
		this.name = nName;
	}
	public void setEmail(String nEmail) {
		this.email = nEmail;
	}
	public String toString() {
		return "NOME: " + this.name + "\nEmail: " + this.email;
	}
}
