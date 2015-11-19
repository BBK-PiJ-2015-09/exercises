public class MySimpleMap implements SimpleMap {
	Pair first;
	
	public String put(int key, String name) {
		Pair newPair = new Pair(key, name);
		if (first == null) {
			first = newPair;
		} else {
			first.addPair(newPair);
		}
		return name;
	}

	public String[] get(int key) {
		return first.getNames(key);
	}

	public void remove(int key, String name) {
		first.removePair(key, name, this);
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printList() {
		System.out.println("*******");
		System.out.println("Printing list:");
		if (first == null) {
			System.out.println("The list is empty!");
		} else {
			first.printList();
		}
		System.out.println("*******");
	}

}