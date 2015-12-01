public class TwoByTwo {
	
	public static void main(String[] args) {

		String[][] mammals = {
			{"Bear", "Forest", "Growl"},
			{"Cat", "Land", "Meow"},
			{"Dog", "Land", "Bark"},
			{"Dolphin", "Aquatic", "Click"},
			{"Monkey", "Jungle", "Ook"},
			{"Whale", "Aquatic", "Whistle"}
		};
		for(int i = 0; i < mammals.length; i++) {
			testMammal(new Mammal(mammals[i]));
			testMammal(new Mammal(mammals[i]));
		}

		String[][] ovipares = {
			{"Beetle", "Land", "Snuffle"},
			{"Crocodile", "Aquatic", "Echo"},
			{"Eagle", "Flying", "Majestic Caw"},
			{"Fly", "Flying", "Pft"},
			{"Frog", "Aquatic", "Ribbet"},
			{"Lizard", "Desert", "Splut"},
			{"Pigeon", "Flying", "Coo"},
			{"Salmon", "Aquatic", "Splosh"},
			{"Shark", "Aquatic", "Silence"},
			{"Snake", "Desert", "Hiss"}
		};
		for(int i = 0; i < ovipares.length; i++) {
			testOvipare(new Ovipare(ovipares[i]));
			testOvipare(new Ovipare(ovipares[i]));
		}

	}

	public static void testMammal(Mammal mammal) {
		mammal.call();
		mammal.reproduce();
		mammal.makeSound();
	}

	public static void testOvipare(Ovipare eggLayer) {
		eggLayer.call();
		eggLayer.reproduce();
		eggLayer.makeSound();
	}

}