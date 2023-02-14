
public class MyQueue {
	
	int max;
	int tail;
	public char[] Queue;
	
	public MyQueue(int size) {
		this.Queue = new char[size];
		this.max = this.Queue.length;
		this.tail = 0;
	}
	
	public void insert(char data) {
		if (tail == max) {
			System.out.println("Queue is full");
			return;
		}
		else {
			Queue[tail] = data;
			tail++;
		}
	}
	
	public char delete() {
		if (tail == 0) {
			System.out.println("#");
		}
		else {
			System.out.println("El dato era: " +Queue[0]);
			for(int i = 1; i < tail; i++) {
				Queue[i -1] = Queue[i];
			}
			Queue[tail -1] = '\0';
			tail--;
		}
		return Queue[tail];
	}
}
