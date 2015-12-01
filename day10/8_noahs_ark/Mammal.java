public class Mammal extends Animal {
	
	public Mammal(String[] args) {
		super(args[0], args[1], args[2]);
	}
	
	// @Override
	public void reproduce() {
		giveBirth();
	}
	
	private void giveBirth() {
		System.out.println("A " + name + " is giving birth!");
	}
	
	// @Override
	public void makeSound() {
		System.out.println("A " + name + " made a " + sound + "!");
	}
	
}