
public class MainStack {
	
	public static void main(String[] args) {
		
		MyStack aStack = new MyStack(10);
		char data = '\0';
		aStack.push('a');
		aStack.push('b');
		aStack.push('c');
		aStack.push('d');
		
		for(int n = 0; n < aStack.top; n++) {
			System.out.print(aStack.Stack[n]);
		}
		
		System.out.println("");
		
		for(int n = aStack.top -1; n >= 0; n--) {
			aStack.pop();
		}
	}
}
