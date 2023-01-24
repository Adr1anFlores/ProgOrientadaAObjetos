
public class Cuadrado {
	
	public int ID;
	public float f;
	
	public Cuadrado() {
		this(175992);
	}

	public Cuadrado(int ID) {
		this.ID = ID;
	}
	
	public float calcDiag() {
		f = ID;
		return (float) Math.sqrt(2*f*f);
	}
	
	public int calcPeri() {
		return ID*4;
	}
	
	public int calcArea() {
		return ID*ID;
	}

	public void cambLong(int lado) {
		ID = lado;
	}

}
