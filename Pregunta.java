import java.util.Scanner;

public class Pregunta {
	
	public static void main(String[] args) {
		
		
				
		Scanner escanear = new Scanner(System.in);
		System.out.println("¿Que figura desea? 1.Cuadrado    o    2.Circulo");
		int i = escanear.nextInt();
		
		if(i == 1) {
			System.out.println("Introduzca el valor del lado (entero)");
			int i2 = escanear.nextInt();
			Cuadrado cuad = new Cuadrado();
			cuad.cambLong(i2);
			
			System.out.println("Calcular:   1.Diagonal   ó   2.Perimetro   ó   3.Area");
			int i3 = escanear.nextInt();
			
			if(i3 == 1) {
				System.out.println("Diagonal: " +cuad.calcDiag());
			}
			
			if(i3 == 2) {
				System.out.println("Perímetro: " +cuad.calcPeri());
			}
			
			if(i3 == 3) {
				System.out.println("Área: " +cuad.calcArea());
			}
		}
		
		if(i ==2) {
			System.out.println("Introduzca el valor del radio (entero)");
			int i2 = escanear.nextInt();
			Circulo circ = new Circulo();
			circ.cambRadio(i2);
			
			System.out.println("Calcular:   1.Circunferencia   ó   2.Area");
			int i3 = escanear.nextInt();
			
			if(i3 == 1) {
				System.out.println("Circunferencia: " +circ.calcCircunf());
			}
			
			if(i3 == 2 ) {
				System.out.println("Área: " +circ.calcAreaCirc());
			}
		}
	}
	

}
