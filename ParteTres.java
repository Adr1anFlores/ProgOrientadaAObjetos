
public class ParteTres {
	
	int top;
	int tail;
	int maxQ;
	int maxS;
	int maxI;
	public char[] stack;
	public char[] queue;
	public char[] invertido;
	public char[] palindrom;
	
	public ParteTres(int size) {
		this.stack = new char[size];
		this.top = 0;
		this.maxS = this.stack.length;
		this.queue = new char[size];
		this.tail = 0;
		this.maxQ = this.queue.length;
		this.invertido = new char[size];
		this.maxI = this.invertido.length;
		this.palindrom = new char[size];
	}
	
	public void push(char data) {
		if(top == maxS) {
			System.out.println("Stack está lleno");
			return;
		}
		else {
			stack[top] = data;
			System.out.println("El dato guardado es: " +stack[top]);
			top++;
		}
	}
	
	public void insert(char data) {
		if (tail == maxQ) {
			System.out.println("Queue está lleno");
			return;
		}
		else {
			queue[tail] = data;
			System.out.println("El dato guardado es : " +queue[tail]);
			tail++;
		}
	}
	
	public char pop() {
		if (top == 0) {
			System.out.println("Stack está vacío");
		}
		else {
			System.out.println("El dato era: " +stack[top -1]);
			stack[top -1] = '\0';
			top--;
		}
		return stack[top];
	}
	
	public char delete() {
		if (tail == 0) {
			System.out.println("#");
		}
		else {
			System.out.println("El dato era: " +queue[0]);
			for(int i = 1; i < tail; i++) {
				queue[i -1] = queue[i];
			}
			queue[tail -1] = '\0';
			tail--;
		}
		return queue[tail];
	}
	
	public String invertir(String palabra) {
		for (int n = 0; n < palabra.length(); n++) {
			invertido[n] = palabra.charAt(n);
		}
		String cadenaInvert = "";
		for (; maxI > 0; maxI--) {
			cadenaInvert += invertido[maxI -1];
		}
		return cadenaInvert;
	}
	
	public boolean palindromo(String palabra) {
		boolean resultado;
		String cadena = "", inversion = "";
		cadena = palabra.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		
		for (int n = 0; n < cadena.length(); n++) {
			palindrom[n] = cadena.charAt(n);
		}
		
		int maxP = cadena.length();
		for (; maxP > 0; maxP--) {
			inversion += palindrom[maxP -1];
		}
		
		System.out.println("La frase invertida es: " +inversion);
		
		return resultado = cadena.equals(inversion);
	}

}
