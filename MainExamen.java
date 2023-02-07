import java.util.Scanner;

public class MainExamen {
	
	public static void main(String[] args) {
		
		Scanner cadena = new Scanner(System.in);
		String palabra;
		
		System.out.println("Examen del primer parcial: Menú de programas.");
		System.out.println("Por: Adrian Flores Mendoza, ID: 175992");
		System.out.println("");
		
		while (true) {
			System.out.println("1. Convertir la primer letra de una frase a mayúscula");
			System.out.println("2. Invertir una frase");
			System.out.println("3. Cambiar las vocales a mayúsculas en una frase");
			System.out.println("4. Ejecutar el programa FizzBuzz");
			System.out.println("5. Definir si una frase o palabra es un palíndromo");
			System.out.println("6. Salir del menú");
			System.out.println("");
			System.out.println("Ingresa una opción: ");
			
			int opcion = Integer.parseInt(cadena.nextLine());
			Examen prog = new Examen();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la frase de su preferencia: ");
				palabra = cadena.nextLine();
				System.out.println("La nueva frase es: " +prog.primeraMayuscula(palabra));
				System.out.println("");
				break;
			case 2:
				System.out.println("Ingrese la frase de su preferencia: ");
				palabra = cadena.nextLine();
				System.out.println("La frase invertida es: " +prog.invertirCadena(palabra));
				System.out.println("");
				break;
			case 3:
				System.out.println("Ingrese la frase de su preferencia: ");
				palabra = cadena.nextLine();
				System.out.println("La frase con las vocales en mayúscula es: " +prog.vocalesMayuscula(palabra));
				System.out.println("");
				break;
			case 4:
				System.out.println("Inicia el conteo del 1 al 100");
				prog.fizzBuzz();
				System.out.println("Conteo terminado");
				System.out.println("");
				break;
			case 5:
				System.out.println("Ingrese la frase de su preferencia: ");
				palabra = cadena.nextLine();
				System.out.println("¿La frase es un palíndromo?: " +prog.palindromo(palabra));
				System.out.println("");
				break;
			case 6:
				System.out.println("Saliendo...");
				System.out.println("Programa terminado.");
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida. Use valores enteros y escoja una de las opciones disponibles.");
				System.out.println("");
				break;
			}
		}
	}
}
