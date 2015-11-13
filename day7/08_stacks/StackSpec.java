public class StackSpec {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(8);
		stack.push(12);
		stack.printSize();
		stack.pop();
		stack.push(13);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}