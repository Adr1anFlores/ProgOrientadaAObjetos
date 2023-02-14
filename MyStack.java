
public class MyStack {
	
	int top;
	int max;
	public char[] Stack;
		
	public MyStack(int size) {
		this.Stack = new char[size];
		this.max = this.Stack.length;
		this.top = 0;
	}
	
	public void push(char data) {
		if(top == max) {
			System.out.println("Stack está lleno");
			return;
		}
		else {
			Stack[top] = data;
			top++;
		}
	}
	
	public char pop() {
		if (top == 0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("El dato era: " +Stack[top -1]);
			Stack[top -1] = '\0';
			top--;
		}
		return Stack[top];
	}
}
