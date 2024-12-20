package Testing;
public class Main {
	public static void main(String[] args) {
		Animal dog = () -> "I am A lambda expression";
		
		System.out.println(dog.getName());
		dog.eats();
		Animal.age();
		dog.runs();
		
		Runnable runnable = () -> {
			for (int i = 1; i <= 5; i++)
				System.out.println("Hello " + i);
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}