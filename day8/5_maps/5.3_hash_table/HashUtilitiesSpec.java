public class HashUtilitiesSpec {

	public static void main(String[] args) {
		MySimpleMap map = new MySimpleMap();
		String str = "An interesting value";
		int hash = str.hashCode();
		int key = HashUtilities.shortHash(hash);
		map.put(key, str);
		
		str = "Another interesting value";
		map.put(key, str);		
		str = "A third interesting value";
		map.put(key, str);
		str = "A third interesting value";
		map.put(key, str);
		str = "A fifth interesting value";
		map.put(key, str);

		System.out.println(map.get(key));
		
		if (map.get(key) != null) {
			for(int i = 0; i < map.get(key).length; i++) {
				System.out.println(map.get(key)[i]);
			}
		}

		map.remove(key, "A third interesting value");

		if (map.get(key) != null) {
			for(int i = 0; i < map.get(key).length; i++) {
				System.out.println(map.get(key)[i]);
			}
		}
		
		System.out.println("Empty: " + map.isEmpty());
		map.remove(key, "Another interesting value");
		map.remove(key, "A fifth interesting value");
		map.remove(key, "An interesting value");
		System.out.println("Empty: " + map.isEmpty());
		
	}

}
