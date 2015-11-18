public class HashUtilitiesSpec {

	public static void main(String[] args) {
		MySimpleMap map = new MySimpleMap();
		String str = "An interesting value";
		int hash = str.hashCode();
		int key = HashUtilities.shortHash(hash);
		map.put(key, str);
		map.printList();
		
		map.put(key, str);
		map.printList();
		str = "Fantastic";
		hash = str.hashCode();
		key = HashUtilities.shortHash(hash);
		map.put(key, str);

		map.printList();
		map.remove(398);
		map.printList();
		System.out.println("Empty: " + map.isEmpty());
		map.remove(75);
		System.out.println("Empty: " + map.isEmpty());
	}

}
