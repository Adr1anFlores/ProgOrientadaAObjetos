
public class ProgramaCuad {
	
	public static void main(String[] args) {
		
		Cuadrado cuad = new Cuadrado();
		
		System.out.println("Lado: " +cuad.ID);
		System.out.println("Diagonal: " +cuad.calcDiag());
		System.out.println("Perímetro: " +cuad.calcPeri());
		System.out.println("Área: " +cuad.calcArea());
		cuad.cambLong(90);
		
		System.out.println("Lado: " +cuad.ID);
		System.out.println("Diagonal: " +cuad.calcDiag());
		System.out.println("Perímetro: " +cuad.calcPeri());
		System.out.println("Área: " +cuad.calcArea());
		
	}

}
