public class Animal {
	String name;
	String type;
	
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void call() {
		if (type == "Aquatic") {
			System.out.println(name + " will not come...");
		} else {
			System.out.println(name + " coming...");
		}
	}
	
	public void reproduce() {
		
	}
	
}