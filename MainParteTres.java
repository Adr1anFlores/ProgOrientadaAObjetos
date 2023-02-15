import java.util.Scanner;

public class MainParteTres {
	
	public static void main(String[] args) {
		
		String palabra;
		
		Scanner frase = new Scanner(System.in);
		char data = '\0';
		ParteTres aStack = new ParteTres(30);
		ParteTres aQueue = new ParteTres(30);
		
		while (true) {
			System.out.println("");
			System.out.println("1. Añade elementos a una cola");
			System.out.println("2. Elimina elemntos de una cola");
			System.out.println("3. Agrega elementos a una pila");
			System.out.println("4. Elimna elementos de un pila");
			System.out.println("5. Invertir una frase");
			System.out.println("6. Definir si una frase o palabra es un palíndromo");
			System.out.println("7. Salir del menú");
			System.out.println("");
			System.out.println("Ingresa una opción: ");
			System.out.println("");
			
			int opcion = Integer.parseInt(frase.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese un caracter de su preferencia: ");
				palabra = frase.nextLine();
				data = palabra.charAt(0);
				aStack.push(data);
				break;
			case 2:
				aStack.pop();
				break;
			case 3:
				System.out.println("Ingrese un caracter de su preferencia: ");
				palabra = frase.nextLine();
				data = palabra.charAt(0);
				aQueue.insert(data);
				break;
			case 4:
				aQueue.delete();
				break;
			case 5:
				System.out.println("Ingrese una frase de su preferencia para invertirla: ");
				palabra = frase.nextLine();
				ParteTres aInvert = new ParteTres(palabra.length());
				System.out.println("La frase invertida es: " +aInvert.invertir(palabra));
				break;
			case 6:
				System.out.println("Ingrese una frase de su preferencia para comprobarla: ");
				palabra = frase.nextLine();
				ParteTres aPalindrom = new ParteTres(palabra.length());
				System.out.println("¿La frase es un palíndromo? " +aPalindrom.palindromo(palabra));
				break;
			case 7:
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
