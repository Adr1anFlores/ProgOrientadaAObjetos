
public class Matrices {
	
	public int[][] matr;
	
	public Matrices(int size1, int size2) {
		this.matr = new int[size1][size2];
	}
	
	public int[][] multiplicar(int[][] a, int[][] b) {
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int n = 0; n < a[0].length; n++) {
						matr[i][j] += a[i][n] * b[n][j]; 
					}
				}
			}
		}
		else {
			System.out.println("Las matrices no pueden multiplicarse");
		}
		return matr;
	}
	
	public int[][] transponer(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[0].length; j++) {
				matr[j][i] += a[i][j];
			}
		}
		return matr;
	}
	
	public int sumaDiagonal(int[][] a) {
		int sum = 0;
		if (a.length == a[0].length) {
			for (int n = 0; n < a.length; n++) {
				sum = sum +a[n][n];
			}
		}
		else {
			System.out.println("Las matrices no pueden multiplicarse");
		}
		return sum;
	}
	
	public int buscarMax(int[][] a) {
		int n = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (n < a[i][j]) {
					n = a[i][j];
				}
			}
		}
		return n;
	}
	
	public int[][] sumar(int[][] a, int[][] b) {
		if (a.length == b.length && a[0].length == b[0].length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					matr[i][j] += a[i][j] + b[i][j];
				}
			}
		}
		else {
			System.out.println("Las matrices no pueden sumarse");
		}
		return matr;
	}
	
	public int[][] multEscalar(int[][] a, int esc) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[0].length; j++) {
				matr[i][j] += esc*a[i][j];
			}
		}
		return matr;
	}

}
