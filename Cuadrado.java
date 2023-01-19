
public class Cuadrado {
	
	public int ID;
	public float f;
	
	public Cuadrado()
	{
		ID = 175992;
	}
	
	public float calcDiag()
	{
		f = ID;
		return (float) Math.sqrt(f + f);
	}
	
	public int calcPeri()
	{
		return ID*4;
	}
	
	public int calcArea()
	{
		return ID*ID;
	}

	public void cambLong(int lado)
	{
		ID = lado;
	}

}
