
public class Circulo {
	
	public int rad;
	public float d;
	
	public Circulo()
	{
		rad = 175992;
	}
	
	public float calcCircunf()
	{
		d = rad;
		return (float) (2*3.14*d);
	}

	public float calcAreaCirc()
	{
		return (float) 3.14*d*d;
	}
	
	public void cambRadio(int radio)
	{
		rad = radio;
	}
}
