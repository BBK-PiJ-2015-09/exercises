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
	
	public String getName() {
		return name;
	}
	
	public Pair getNext() {
		return next;
	}

	public Pair getLast() {
		return last;
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
			next.addPair(newPair);
		}
	}

	public String[] getNames(int queryKey) {
		if (emptyArray(queryKey).length > 0 ) {
			String[] output = emptyArray(queryKey);
			return fillArray(queryKey, output);
		} else {
			return null;
		}
	}

	private String[] emptyArray(int queryKey) {
		int count = 0;
		Pair pair = this;
		while(pair!=null) {
			if(pair.getKey() == queryKey) {
				count++;
			}
			pair = pair.getNext();
		} 
		return new String[count];
	}

	private String[] fillArray(int queryKey, String[] output) {
		int count = 0;
		Pair pair = this;
		while(pair!=null) {
			if (pair.getKey() == queryKey) {
				output[count] = pair.getName();
				count++;
			}
			pair = pair.getNext();
		}
		return output;
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

	public void removePair(int commandKey, String commandName, MySimpleMap map) {
		if (key == commandKey && name == commandName) {
			Pair tempNext = next;
			remove(map);
			if (tempNext != null) {
				tempNext.removePair(commandKey, commandName, map);
			}
		} else if (next == null) {
			
		} else {
			next.removePair(commandKey, commandName, map);
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
		System.out.println("Key:  " + key);
		System.out.println("Name: " + name);
		System.out.println("-------");	
	}

}