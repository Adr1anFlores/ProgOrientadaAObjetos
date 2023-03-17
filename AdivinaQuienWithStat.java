import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class AdivinaQuienWithStat {
	
	static File file;
	
	public static void main(String[] args) {
		
		Scanner opcion = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre de usuario: ");
		String nickName = opcion.nextLine();
		
		while (true) {	
		
			String[] names = {"Anakin Skywalker", "Obi-Wan Kenobi  ", "Maestro Yoda    ", "Ahsoka Tano     ", "Padmé Amidala   ", "Darth Sidious   ", "Lord Maul       ", "Conde Dooku     ", "General Grievous", "Asajj Ventress  "};
			String[] atrAl = {"lleno", "lleno", "lleno", "lleno", "lleno", "lleno", "lleno", "lleno", "lleno", "lleno"};
			String[] height = 		{"es alto  ", "es bajito", "es bajito", "es alto  ", "es alto  ", "es bajito", "es bajito", "es alto  ", "es bajito", "es alto  "};
			String[] age = 			{"es joven ", "es joven ", "es viejo ", "es viejo ", "es joven ", "es joven ", "es viejo ", "es viejo ", "es joven ", "es joven "};
			String[] strength = 	{"es fuerte", "es débil ", "es fuerte", "es débil ", "es fuerte", "es débil ", "es fuerte", "es débil ", "es fuerte", "es débil "};
			String[] human = 		{"es humano", "es humano", "es humano", "es humano", "es alien ", "es alien ", "es alien ", "es alien ", "es humano", "es alien "};
			Random random = new Random();
			SpecificPerson[] individuo = new SpecificPerson[10];
			
			for (int n = 0; n < 10; n++) {
				int randNom = random.nextInt(10);
				
				while (names[randNom] == null) {
					randNom = random.nextInt(10);
				}
				individuo[n] = new SpecificPerson();
				String nombreAl = names[randNom];
				names[randNom] = null;
				individuo[n].setNombre(nombreAl);
				
				int randAtr = random.nextInt(10);
				while (atrAl[randAtr] == null) {
					randAtr = random.nextInt(10);
				}
				
				individuo[n].setAltura(height[randAtr]);
				individuo[n].setEdad(age[randAtr]);
				individuo[n].setFuerza(strength[randAtr]);
				individuo[n].setHumano(human[randAtr]);
				atrAl[randAtr] = null;
			} //Asigna un nombre y atributos aleatorios a cada persona
			
			System.out.println("Juega:     _-|-_  Adivina Quién  _-|-_");
			System.out.println("");
			System.out.println("Realiza tres preguntas y escoge al protagonista aleatorio entre 10 personajes distintos.");
			System.out.println("Los 10 personajes se muestran a continuación:");
			System.out.println("");
			
			System.out.println("   Nombre                Altura       -      Edad       -       Fuerza      -      Especie");
			for (int n = 0; n < 10; n++) {
				System.out.println(n +". " +individuo[n].getNombre() +"      " +individuo[n].getAltura() +"          " +individuo[n].getEdad() +"          " +individuo[n].getFuerza() +"          " +individuo[n].getHumano());
			} //Imprime a la persona y sus atributos
			
			System.out.println("");
			int prota = random.nextInt(10);
			int pregunta;
			String atribPrinc = "";
			
			for (int i = 3; i > 0; i--) {
				System.out.println("Realiza una de las siguientes preguntas (no repitas preguntas o perderas intentos)");
				System.out.println("Te quedan " +i +" intentos");
				System.out.println("");
				System.out.println("1. ¿El personaje es alt@ o baj@?");
				System.out.println("2. ¿El personaje es joven o viej@?");
				System.out.println("3. ¿El personaje es fuerte o débil?");
				System.out.println("4. ¿El personaje es human@ o alien?");
				System.out.println("");
				
				pregunta = opcion.nextInt();
				
				switch(pregunta) {
					case 1:
						atribPrinc = individuo[prota].getAltura();
						for (int n = 0; n < 10; n++) {
							while (atribPrinc != individuo[n].getAltura()) {
								individuo[n].setNombre(null);
								break;
							}
						} //Si el atributo de los demás personajes no coincide con el del protagonista, sus nombres se borran
						break;
					case 2:
						atribPrinc = individuo[prota].getEdad();
						for (int n = 0; n < 10; n++) {
							while (atribPrinc != individuo[n].getEdad()) {
								individuo[n].setNombre(null);
								break;
							}
						}
						break;
					case 3:
						atribPrinc = individuo[prota].getFuerza();
						for (int n = 0; n < 10; n++) {
							while (atribPrinc != individuo[n].getFuerza()) {
								individuo[n].setNombre(null);
								break;
							}
						}
						break;
					case 4:
						atribPrinc = individuo[prota].getHumano();
						for (int n = 0; n < 10; n++) {
							while (atribPrinc != individuo[n].getHumano()) {
								individuo[n].setNombre(null);
								break;
							}
						}
						break;
					default:
						System.out.println("La opción ingresada es incorrecta. Perdiste un intento :)");
						break;
				}
				
				System.out.println("");
				System.out.println("El personaje " +atribPrinc);
				System.out.println("");
				System.out.println("Las personas restantes son: ");
				System.out.println("");
				System.out.println("   Nombre                Altura       -      Edad       -       Fuerza      -      Especie");
				
				for (int n = 0; n < 10; n++) {
					while (individuo[n].getNombre() != null) {
						System.out.println(n +". " +individuo[n].getNombre() +"      " +individuo[n].getAltura() +"          " +individuo[n].getEdad() +"          " +individuo[n].getFuerza() +"          " +individuo[n].getHumano());
					break;
					}
				} //Imprime las personas restantes y sus atributos
				
				System.out.println("");
			}
			
			System.out.println("Ahora que ya hiciste todas tus preguntas, introduce el índice del protagonista");
			int eleccion = opcion.nextInt();
			int ganador;
			System.out.println("");
			
			if (eleccion == prota) {
				System.out.println("El personaje era... " +individuo[prota].getNombre());
				System.out.println("¡Felicidades! Acertaste y eres ganador :D");
				ganador = 1;
			}
			else {
				System.out.println("No acertaste. Suerte a la próxima :)");
				ganador = 0;
			}
			
			System.out.println("");
			files(nickName, ganador);
			
			System.out.println("");
			System.out.println("¿Quieres seguir jugando?");
			System.out.println("1. Sí      ó      2. No");
			pregunta = opcion.nextInt();
			
			if (pregunta == 1) {
				System.out.println("");
			}
			else {
				System.out.println("Vuelve pronto :)");
				System.exit(0);
			}
		}
	}
	
	public static void files(String nickName, int ganador) {
		file = new File("C:\\Users\\aflor\\Downloads\\Programación Orientada a Objetos\\PruebaArchivos", nickName +".txt");
		
		if (file.exists()) {
		}
		else {
			try {
				write(0, 0, nickName);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			int n = 1 + Integer.parseInt(countGames());
			int m = ganador + Integer.parseInt(countWins());
			write(n, m, nickName);
			read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void write(int n, int m, String nick) throws IOException {
			
	    FileWriter fileWriter 	= new FileWriter(file);
	    PrintWriter printWriter = new PrintWriter(fileWriter);

	    printWriter.print("Estadísticas de: " +nick +"\r\n");
	    printWriter.print("Partidas jugadas: \r\n");
	    printWriter.println(n);
	    printWriter.print("Partidas ganadas: \r\n");
	    printWriter.println(m);
	    printWriter.close();
	}
	
	public static void read() throws IOException { 
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String str = bufReader.readLine();
		String str2 = bufReader.readLine();
		String str3 = bufReader.readLine();
		String str4 = bufReader.readLine();
		String str5 = bufReader.readLine();
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
    }
	
	public static String countGames() throws IOException { 
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String str = bufReader.readLine();
		String str2 = bufReader.readLine();
		String str3 = bufReader.readLine();
		
		return str3;
    }
	
	public static String countWins() throws IOException {
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String str = bufReader.readLine();
		String str2 = bufReader.readLine();
		String str3 = bufReader.readLine();
		String str4 = bufReader.readLine();
		String str5 = bufReader.readLine();
		
		return str5;
    }
}
