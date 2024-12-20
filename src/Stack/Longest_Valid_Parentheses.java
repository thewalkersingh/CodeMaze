package Stack;
import java.util.Stack;

public class Longest_Valid_Parentheses {
	public static void main(String[] args) {
		String s = "()(()))";
		System.out.println(longestValidParentheses(s));
	}
	
	public static int longestValidParentheses(String s) {
		int count = 0;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (stack.pop() == ')') {
				count = count + 2;
			}
			else if (stack.isEmpty()) {
				return 0;
			}
		}
		return count;
	}
}