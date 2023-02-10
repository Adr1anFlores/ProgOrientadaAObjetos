import java.util.Arrays;

public class MainArreglo {
	
	public static void main(String[] args) {
	
	int[] numero = new int[15];
	String[] nombre = new String[20];
	
	Estudiante[] student = new Estudiante[100];
	
	numero[9] = 5;
	nombre[0] = "Francisco";
	numero[7] = 56;
	numero[12] = 21;
	
	int indice;
	indice = 10;
	
	mostrarArreglo(numero);
	//mostrarArreglo(nombre);
	buscarArreglo(numero,indice);
	//buscarArreglo(nombre,indice);
	//eliminarArreglo(numero,indice);
	//eliminarArreglo(nombre,indice);
	
	}
	
	public static void mostrarArreglo(int[] numero) {
		System.out.println("El arreglo es:");
		System.out.println(Arrays.toString(numero));
	}
	
	public static void mostrarArreglo(String[] nombre) {
		System.out.println("El arreglo es:");
		System.out.println(Arrays.toString(nombre));
	}
	
	public static void buscarArreglo(int[] numero, int indice) {
		if ((indice <= numero.length) && indice > 0) {
			System.out.println("El valor en el índice " +(indice-1) +" es: " +numero[indice - 1]);
		}
		else {
			System.out.println("Valor inválido. Ingrese un valor válido.");
		}	
	}
	
	public static void buscarArreglo(String[] nombre, int indice) {
		if ((indice <= nombre.length) && indice > 0) {
			System.out.println("El valor en el índice " +(indice-1) +" es: " +nombre[indice - 1]);
		}
		else {
			System.out.println("Valor inválido. Ingrese un valor válido.");
		}	
	}
	
	public static void eliminarArreglo(int[] numero, int indice) {
		if ((indice <= numero.length) && indice > 0) {
		for(int i = indice; i < numero.length -1; i++) {
			numero[i -1] = numero[i];
		}
		numero[numero.length -1] = 0;
		System.out.println(Arrays.toString(numero));
		}
		else {
			System.out.println("Valor inválido. Ingrese un valor válido.");
		}
	}
	
	public static void eliminarArreglo(String[] nombre, int indice) {
		if ((indice <= nombre.length) && indice > 0) {
		for(int i = indice; i < nombre.length -1; i++) {
			nombre[i -1] = nombre[i];
		}
		nombre[nombre.length -1] = null;
		System.out.println(Arrays.toString(nombre));
		}
		else {
			System.out.println("Valor inválido. Ingrese un valor válido.");
		}
	}
	
}
