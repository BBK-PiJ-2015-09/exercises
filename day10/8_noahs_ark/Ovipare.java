/**
 * Egg-laying beasts
 */
public class Ovipare extends Animal {
	
	public Ovipare(String[] args) {
		super(args[0], args[1], args[2]);
	}
	
	// @Override
	public void reproduce() {
		layEggs();
	}
	
	private void layEggs() {
		System.out.println("Jesus Christ, a " + name + " is laying eggs!");
	}
	
	// @Override
	public void makeSound() {
		System.out.println("A " + name + " made a " + sound + "!");
	}
	
}
