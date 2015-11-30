public abstract class Animal {
	String name;
	String type;
	String sound;
	
	public Animal(String name, String type, String sound) {
		this.name = name;
		this.type = type;
		this.sound = sound;
	}
	
	public void call() {
		if (type == "Aquatic") {
			System.out.println(name + " will not come...");
		} else if (type == "Flying") {
			System.out.println(name + " now flying, will come later when tired...");
		} else {
			System.out.println(name + " coming...");
		}
	}
	
	public abstract void reproduce();
	
	public abstract void makeSound();
	
}