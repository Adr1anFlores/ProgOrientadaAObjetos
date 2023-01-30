
public class Circulo {
	
	public double rad;
	
	public Circulo() {
		this(175992);
	}
	
	public Circulo(double rad) {
		this.rad = rad;
	}
	
	public double calcCircunf() {
		return (2*3.14*rad);
	}

	public double calcAreaCirc() {
		return (3.14*rad*rad);
	}
	
	public void cambRadio(double radio) {
		rad = radio;
	}
}
