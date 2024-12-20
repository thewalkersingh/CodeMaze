package Stack;
public class StackUsingArray {
	int top;
	int capacity = 0;
	int[] arr;
	
	StackUsingArray(int capacity) {
		// Write your code here.
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
	}
	
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(5);
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
//		stack.push(64);
//		stack.push(23);
//		stack.push(60);
//		System.out.println(stack.top());
	}
	
	public void push(int num) {
		// 1 Write your code here.
		if (isFull() == 1) {
			return;
		}
		arr[++top] = num;
	}
	
	public int pop() {
		// 2 Write your code here.
		if (isEmpty() == 1)
			return -1;
		return arr[top--];
	}
	
	public int top() {
		// 3 Write your code here.
		if (isEmpty() == 1)
			return -1;
		return arr[top];
	}
	
	public int isEmpty() {
		// 4 Write your code here.
		if (top == -1)
			return 1;
		else
			return 0;
	}
	
	public int isFull() {
		// 5 Write your code here.
		if (top == capacity - 1)
			return 1;
		else
			return 0;
	}
}
/*
2 6
1 1
1 2
2
3
4
5
 */