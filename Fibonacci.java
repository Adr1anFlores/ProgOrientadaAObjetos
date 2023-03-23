import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	
	List<Integer> listaFibonacci;
	
	public Fibonacci() {
		this.listaFibonacci = new ArrayList<Integer>();
	}
	
	public List<Integer> fillList() {
		listaFibonacci.add(1);
		listaFibonacci.add(1);
		int n = 1;
		
		while (listaFibonacci.get(n) <= 1000000) {
			listaFibonacci.add(listaFibonacci.get(n)+listaFibonacci.get(n-1));
			n++;
		}
		
		return listaFibonacci;
	}
}
