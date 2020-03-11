package entities;

public class Rectangle {
	public double base;
	public double altura;
	
	// Area
	public double Area() {
		return base * altura;
	}
	// Perimeter P = 2(b + h)
	public double Perimeter() {
		return 2 * (base + altura);
	}
	
	// Diagonal
	public double Diagonal() {
		return Math.sqrt(base * base + altura * altura);
	}
	
	public String toString() {
		return "RESULTADO DOS C¡LCULOS:"
				+ String.format("\n¡REA: %.2f\nPERÕMETRO: %.2f\nDIAGONAL: %.2f\n\nRESOLVIDO", Area(), Perimeter(), Diagonal());

	}
	
}
