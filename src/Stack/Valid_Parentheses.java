package Stack;
import java.util.Stack;

public class Valid_Parentheses {
	public static void main(String[] args) {
		String s = "()[]{}";    // Output: true
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}