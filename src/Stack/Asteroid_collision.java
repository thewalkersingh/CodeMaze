package Stack;
import java.util.Stack;

public class Asteroid_collision {
	public static void main(String[] args) {
		int[] asteroids = {5, 10, -5};    // Output: [5,10]
		for (int i : asteroidCollision(asteroids))
			System.out.println(i);
	}
	
	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> ans = new Stack<>();
		for (int i : asteroids)
			stack.push(i);
//		while (!stack.isEmpty())
//			System.out.println(stack.pop());
		while (!stack.isEmpty()) {
			int a = stack.pop();
			int b = stack.pop();
			System.out.println(a);
			System.out.println(b);
			if (a == b)
				continue;
			if (a < b && a < 0)
				ans.push(b);
			if (a >= 0 && b >= 0) {
				ans.push(a);
				ans.push(b);
			}
		}
		int[] arr = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			arr[i] = ans.get(i);
		}
		return null;
	}
}