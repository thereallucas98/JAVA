package entities;

public class Lampada {
	private LampadaTresEstados lampadae;
	
	
	// CONSTRUTOR
	public Lampada(LampadaTresEstados newestado) {
		this.lampadae = newestado;
	}
	// GET E SET
	public void setLampadaTresEstados(LampadaTresEstados e) {
		this.lampadae = e;
	}
	
	public LampadaTresEstados getLampadaTresEstados() {
		return lampadae;
	}
	
	// RETURN
	public String toString() {
		return "STATUS\n" + lampadae;
	}
}
