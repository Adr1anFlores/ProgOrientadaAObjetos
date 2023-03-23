import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {
	
	File file = new File("C:\\Users\\aflor\\Downloads\\Programación Orientada a Objetos\\PruebaArchivos", "Fibonacci.txt");
	
	public void ejecutar() {
		
		Fibonacci lista = new Fibonacci();
		Splitter par = new Splitter();
		Splitter impar = new Splitter();
		
		try {
			FileWriter fileWriter 	= new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.println("Serie de Fibonacci");
			printWriter.println(lista.fillList());
			printWriter.println("Serie de Fibonacci (sólo pares)");
			printWriter.println(par.splitPar(lista.fillList()));
			printWriter.println("Serie de Fibonacci (sólo impares)");
			printWriter.println(impar.splitImpar(lista.fillList()));
			printWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
