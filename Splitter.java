import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Splitter {
	
	List<Integer> listaPar, listaImpar;
	Fibonacci lista;
	
	public Splitter() {
		this.listaPar = new ArrayList<Integer>();
		this.listaImpar = new ArrayList<Integer>();
		this.lista = new Fibonacci();
	}
	
	public List<Integer> splitPar(List<Integer> listaFibonacci) {
		int n = 0;
		
		while (listaFibonacci.get(n) <= 1000000) {
			if (listaFibonacci.get(n) % 2 == 0) {
				listaPar.add(listaFibonacci.get(n));
			}
			else {
				//No hace nada :)
			}
			n++;
		}
		
		return listaPar;
	}
	
	public List<Integer> splitImpar(List<Integer> listaFibonacci) {
		int n = 0;
		
		while (listaFibonacci.get(n) <= 1000000) {
			if (listaFibonacci.get(n) % 2 == 1) {
				listaImpar.add(listaFibonacci.get(n));
			}
			else {
				//No hace nada :)
			}
			n++;
		}
		
		return listaImpar;
	}
}
