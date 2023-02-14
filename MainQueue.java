
public class MainQueue {
	
	public static void main(String[] args) {
		
		MyQueue aQueue = new MyQueue(10);
		char data = '\0';
		
		aQueue.insert('a');
		aQueue.insert('b');
		aQueue.insert('c');
		aQueue.insert('d');
		
		for(int n = 0; n < aQueue.Queue.length; n++) {
			System.out.print(aQueue.Queue[n]);
		}
		
		System.out.println("");
		
		for(int n = aQueue.tail -1; n >= 0; n--) {
			aQueue.delete();
		}	
	}
}
