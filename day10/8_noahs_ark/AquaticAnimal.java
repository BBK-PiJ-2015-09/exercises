public class AquaticAnimal extends Animal {
	
	public AquaticAnimal(String name) {
		super(name);
	}
	
	//@Override
	public void call() {
		System.out.println(name + " will not come...");
	}
}