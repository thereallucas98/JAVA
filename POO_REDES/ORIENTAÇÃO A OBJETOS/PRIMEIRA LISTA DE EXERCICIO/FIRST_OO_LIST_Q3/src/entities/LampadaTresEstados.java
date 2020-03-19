package entities;

import javax.swing.JOptionPane;

public class LampadaTresEstados {
	private String apagada;
	private String meialuz;
	private String acessa;
	// CONSTRUTOR
	public LampadaTresEstados(String off, String kindof, String lightup) {
		this.apagada = off;
		this.meialuz = kindof;
		this.acessa = lightup;
	}
	// GET E SET
	public void setAcessa(String lightup) {
		this.acessa = lightup;
	}
	
	public void setMeiaLuz(String kindof) {
		this.meialuz = kindof;
	}
	
	public void setApagada(String off) {
		this.apagada = off;
	}
	
	public String getAcessa() {
		return this.acessa;
	}
	
	public String getMeiaLuz() {
		return this.meialuz;
	}
	
	public String getApagada() {
		return this.apagada;
	}
	
	public String toString() {
		return "ACESSA: " + this.acessa
				+ "\nMEIA-LUZ: " + this.meialuz
				+ "\nAPAGADA: " + this.apagada;
	}
	
	
	
}
