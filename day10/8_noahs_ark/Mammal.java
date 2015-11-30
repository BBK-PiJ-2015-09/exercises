public class Mammal extends Animal {
	
	public Mammal(String name, String type) {
		super(name, type);
	}
	
	// @Override
	public void reproduce() {
		giveBirth();
	}
	
	public void giveBirth() {
		System.out.println("A " + name + " is giving birth!");
	}
	
}