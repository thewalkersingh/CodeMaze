package Testing;
public class Dog implements Animal {
	@Override public String getName() {
		return "Software Engineer";
	}
	
	@Override public void eats() {
		System.out.println("Calling super method");
		Animal.super.eats();
	}
	
	@Override public void runs() {
		System.out.println("It will override Super class run");
	}
}