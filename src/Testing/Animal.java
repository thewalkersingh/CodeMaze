package Testing;
@FunctionalInterface
public interface Animal {
	static void age() {
		System.out.println("Animal will age");
	}
	
	static void jumps() {
		System.out.println("I will Jump");
	}
	
	String getName();
	
	default void eats() {
		System.out.println("Animals Eats");
	}
	
	default void runs() {
		System.out.println("Animal will run");
	}
}