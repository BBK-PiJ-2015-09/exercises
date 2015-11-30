public abstract class Mammal extends Animal {
	
	public Mammal(String name, String type, String sound) {
		super(name, type, sound);
	}
	
	// @Override
	public void reproduce() {
		giveBirth();
	}
	
	public void giveBirth() {
		System.out.println("A " + name + " is giving birth!");
	}
	
	// @Override
	public void makeSound() {
		System.out.println("A " + name + " made a " + sound + "!");
	}
	
}