class MySimpleMap implements SimpleMap {
	Pair first;
	
	private void addPair(int key, String name) {
		Pair newPair = new Pair(key, name);
		if (first == null) {
			first = newPair;
		} else {
			first.addPair(newPair);
		}
	}

	public void put(int key, String name) {
		if (first == null || get(key) == null) {
			addPair(key, name);
			System.out.println("Pair added with key " + key + " and name " + name);
		} else {
			System.out.println("Error: key " + key + " already returns the name: " + get(key));
		}
	}

	public String get(int key) {
		return first.getPair(key);
	}

	public void remove(int key) {
		first.removePair(key, this);
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