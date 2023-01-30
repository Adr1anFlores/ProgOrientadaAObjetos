import java.util.Scanner;

public class Menu {
	
public static void main(String[] args) {
		
		Scanner opcion = new Scanner(System.in);
		double lado,radio;
		
		while (true) {
			System.out.println("1. Calcular la diagonal de un cuadrado");
			System.out.println("2. Calcular el perímetro de un cuadrado");
			System.out.println("3. Calcular el área de un cuadrado");
			System.out.println("4. Calcular la cirunferencia de un círculo");
			System.out.println("5. Calcular el área de un círculo");
			System.out.println("6. Salir del menú");
			System.out.println("Ingresa una opción: ");
			
			int a = Integer.parseInt(opcion.nextLine());
			Cuadrado cuad = new Cuadrado();
			Circulo circ = new Circulo();
			
			switch (a) {
				case 1:
					System.out.println("Ingrese la longitud del lado del cuadrado: ");
					lado = Double.parseDouble(opcion.nextLine());
					cuad.cambLong(lado);
					System.out.println("La diagonal del cuadrado es: " +cuad.calcDiag());
					break;
				case 2:
					System.out.println("Ingrese la longitud del lado del cuadrado: ");
					lado = Double.parseDouble(opcion.nextLine());
					cuad.cambLong(lado);
					System.out.println("El perímetro del cuadrado es: " +cuad.calcPeri());
					break;
				case 3:
					System.out.println("Ingrese la longitud del lado del cuadrado: ");
					lado = Double.parseDouble(opcion.nextLine());
					cuad.cambLong(lado);
					System.out.println("El área del cuadrado es: " +cuad.calcArea());
					break;
				case 4:
					System.out.println("Ingrese la longitud del radio del círculo: ");
					radio = Double.parseDouble(opcion.nextLine());
					circ.cambRadio(radio);
					System.out.println("La circunferencia del círculo es: " +circ.calcCircunf());
					break;
				case 5:
					System.out.println("Ingrese la longitud del radio del círculo: ");
					radio = Double.parseDouble(opcion.nextLine());
					circ.cambRadio(radio);
					System.out.println("El área del círculo es: " +circ.calcAreaCirc());
					break;
				case 6:
					System.out.println("Saliendo...");
					System.out.println("Programa terminado.");
					System.exit(0);
					break;
				default:
					System.out.println("Opción inválida. Use valores enteros y escoja una de las opciones disponibles.");
					break;
			}
		}
	}
}
