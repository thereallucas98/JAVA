package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private String agendaNome;
	private String agendaNumero;
	private List<Contato> contatos = new ArrayList<>();
	
	public Agenda() {
	}
	
	public Agenda(String agendaNome, String agendaNumero) {
		this.agendaNome = agendaNome;
		this.agendaNumero = agendaNumero;
	}

	public String getAgendaNome() {
		return agendaNome;
	}

	public void setAgendaNome(String agendaNome) {
		this.agendaNome = agendaNome;
	}

	public String getAgendaNumero() {
		return agendaNumero;
	}

	public void setAgendaNumero(String agendaNumero) {
		this.agendaNumero = agendaNumero;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void addcontato(Contato contato) {
		contatos.add(contato);
	}
	
	public void removecontato(Contato contato) {
		contatos.remove(contato);
	}

	@Override
	public String toString() {
		return "Agenda\nNome: " + agendaNome + "\nNúmero: " + agendaNumero + "\n\nLista de contatos: " + contatos;
	}
	
	
	
	
	
}
