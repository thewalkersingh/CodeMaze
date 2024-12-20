package Stack;
import java.util.Stack;

public class Remove_stars_from_string {
	public static void main(String[] args) {
		String s = "leet**cod*e";  // Output: "lecoe"
		System.out.println(removeStars(s));
	}
	
	public static String removeStars(String s) {
		Stack<Character> stack1 = new Stack<>();
		for (char c : s.toCharArray())
			stack1.push(c);
		Stack<Character> stack2 = new Stack<>();
		for (char c : stack1) {
			stack2.push(c);
			if (c == '*') {
				stack2.pop();
				stack2.pop();
			}
		}
		StringBuilder result = new StringBuilder();
		for (char c : stack2) {
			result.append(c);
		}
		return result.toString();
	}
	
	public static String removeStars2(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '*') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
			else {
				stack.push(c);
			}
		}
		
		// Build the result string from the stack
		StringBuilder result = new StringBuilder();
		for (char c : stack) {
			result.append(c);
		}
		return result.toString();
	}
}