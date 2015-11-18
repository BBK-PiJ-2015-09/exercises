public class Pair {
	private int key;
	private String name;
	private Pair next;
	private Pair last;

	public Pair(int key, String name) {
		this.key = key;
		this.name = name;
		this.next = null;
		this.last = null;
	}

	public int getKey() {
		return key;
	}

	public void setNext(Pair nextPair) {
		next = nextPair;
	}

	public void setLast(Pair lastPair) {
		last = lastPair;
	}

	public void addPair(Pair newPair) {
		if (next == null) {
			link(this, newPair);
		} else {
			addPair(newPair);
		}
	}

	public String getPair(int queryKey) {
		if (key == queryKey) {
			return name;
		} else if (next == null) {
			return null;
		} else {
			return next.getPair(queryKey);
		}
	}

	public void removePair(int commandKey, MySimpleMap map) {
		if (key == commandKey) {
			remove(map);
		} else if (next == null) {
			System.out.println("Not found.");
		} else {
			next.removePair(commandKey, map);
		}
	}

	public void printList() {
		print();
		if (next != null) {
			next.printList();
		}
	}

	private void remove(MySimpleMap map) {
		System.out.println("Removing: ");
		print();
		link(last, next);
		if (last == null) {
			map.first = next;
		} else {
			last = null;
		}
		next = null;
	}

	private void link(Pair a, Pair b) {
		if (a != null) {
			a.setNext(b);
		}
		if (b != null) {
			b.setLast(a);
		}
	}

	private void print() {
		System.out.println("-------");
		System.out.println("Key:   " + key);
		System.out.println("Name: " + name);
		System.out.println("-------");	
	}

}