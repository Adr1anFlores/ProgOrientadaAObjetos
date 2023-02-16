import java.util.Arrays;

public class MainMatrices {
	
	public static void main(String[] args) {
		
		int[][] a = { { 1, 2, -3 }, { 4, 0, -2 } }; //Matriz de 2x3
	    int[][] b = { { 3, 1 }, { 2, 4 }, { -1, 5 } }; //Matriz de 3x2
	    int[][] e = { { 3, 1 ,- 3}, { 2, 4, 7 }, { -1, 5 , 11} }; //Matriz de 3x3
	    int[][] f = { { 5, 7, 4 }, { 2, 1, -7 } }; //Matriz de 2x3
	    
	    //Multiplicar dos matrices
	    Matrices multRes = new Matrices(a.length, b[0].length);
	    int[][] c = multRes.multiplicar(a, b);
	    System.out.println(Arrays.deepToString(c));
	    
	    //Transponer una matriz
	    Matrices transp = new Matrices(a[0].length, a.length);
	    int[][] d = transp.transponer(a);
	    System.out.println(Arrays.deepToString(d));
	    
	    //Calcular la suma de la diagonal principal
	    Matrices diagonal = new Matrices(e.length, e[0].length);
	    System.out.println(diagonal.sumaDiagonal(e));
	    
	    //Buscar el valor máximo de una matriz
	    Matrices maximo = new Matrices(e.length, e[0].length);
	    System.out.println(maximo.buscarMax(e));
	    
	    //Sumar dos matrices
	    Matrices sumar = new Matrices(a.length, a[0].length);
	    int[][] g = sumar.sumar(a, f);
	    System.out.println(Arrays.deepToString(g));
	    
	    //Multiplicar una matriz por un escalar
	    Matrices escalar = new Matrices(a.length, a[0].length);
	    int[][] h = escalar.multEscalar(a, 3);
	    System.out.println(Arrays.deepToString(h));
	}
}
