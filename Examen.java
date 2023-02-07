
public class Examen {
	
	public String mayusPrim, cadInvert, vocalMayus, palindromo;
	
	public Examen() {
		this(" "," "," "," ");
	}

	public Examen(String mayusPrim, String cadInvert, String vocalMayus, String palindromo) {
		this.mayusPrim = mayusPrim;
		this.cadInvert = cadInvert;
		this.vocalMayus = vocalMayus;
		this.palindromo = palindromo;
	}
	
	public String primeraMayuscula(String palabra) {
		return mayusPrim = palabra.toUpperCase().charAt(0) + palabra.substring(1, palabra.length()); 
	}
	
	public String invertirCadena(String palabra) {
		int n = palabra.length() - 1;
		for (;n >= 0; n--) {
			cadInvert += palabra.charAt(n);
		}
		return cadInvert = cadInvert + "";  //Agrego comillas vacías para evitar los warnings
	}
	
	public String vocalesMayuscula(String palabra) {
		vocalMayus = palabra;
		vocalMayus = vocalMayus.replace("á", "Á").replace("é", "É").replace("í", "Í").replace("ó", "Ó").replace("ú", "Ú");
		return vocalMayus = vocalMayus.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
	}
	
	public void fizzBuzz() {
		int contador = 1;
		while (contador <=100) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println("FizzBuzz");
				contador++;
				continue;
			}
			if (contador % 3 == 0) {
				System.out.println("Fizz");
				contador++;
				continue;
			}
			if (contador % 5 == 0) {
				System.out.println("Buzz");
				contador++;
				continue;
			}
			System.out.println(contador);
			contador++;
		}
	}
	
	public boolean palindromo(String palabra) {
		boolean resultado;
		String sinEspNiAcent = palabra;
		
		sinEspNiAcent = sinEspNiAcent.toLowerCase().replace(" ", "").replace(".", "").replace(",", "");
		sinEspNiAcent = sinEspNiAcent.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		
		String palind = new StringBuilder(sinEspNiAcent).reverse().toString();  //utilizo un invertidor distinto porque el anterior daba problemas con este método
		System.out.println("La palabra al revés es: " +palind);
		return resultado = palind.equals(sinEspNiAcent); 
	}
}
