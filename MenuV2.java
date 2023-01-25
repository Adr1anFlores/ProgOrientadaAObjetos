import java.util.Scanner;

public class MenuV2 {
	
	public static void main(String[] args) {
		
		
		Scanner escanear = new Scanner(System.in);
		String pr;
		int a,b,c;
		System.out.println("¿Que figura desea? 1.Cuadrado    o    2.Circulo");
		pr = escanear.nextLine();
		a = Integer.parseInt(pr);
		
		if(a == 1) {
			System.out.println("Introduzca el valor del lado (entero)");
			pr = escanear.nextLine();
			Cuadrado cuad = new Cuadrado();
			b = Integer.parseInt(pr);
			cuad.cambLong(b);
			
			System.out.println("Calcular:   1.Diagonal   ó   2.Perimetro   ó   3.Area");
			pr = escanear.nextLine();
			c = Integer.parseInt(pr);
			
			if(c == 1) {
				System.out.println("Diagonal: " +cuad.calcDiag());
			}
			
			if(c == 2) {
				System.out.println("Perímetro: " +cuad.calcPeri());
			}
			
			if(c == 3) {
				System.out.println("Área: " +cuad.calcArea());
			}
		}
		
		if(a == 2) {
			System.out.println("Introduzca el valor del radio (entero)");
			pr = escanear.nextLine();
			Circulo circ = new Circulo();
			b = Integer.parseInt(pr);
			circ.cambRadio(b);
			
			System.out.println("Calcular:   1.Circunferencia   ó   2.Area");
			pr = escanear.nextLine();
			c = Integer.parseInt(pr);
			
			if(c == 1) {
				System.out.println("Circunferencia: " +circ.calcCircunf());
			}
			
			if(c == 2 ) {
				System.out.println("Área: " +circ.calcAreaCirc());
			}
		}
	}
}