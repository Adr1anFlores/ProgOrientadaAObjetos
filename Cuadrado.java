
public class Cuadrado {
	
	public double ID;
		
	public Cuadrado() {
		this(175992);
	}

	public Cuadrado(double ID) {
		this.ID = ID;
	}
	
	public double calcDiag() {
		return Math.sqrt(2*ID*ID);
	}
	
	public double calcPeri() {
		return ID*4;
	}
	
	public double calcArea() {
		return ID*ID;
	}

	public void cambLong(double lado) {
		ID = lado;
	}
}
