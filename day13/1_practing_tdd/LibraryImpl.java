public class LibraryImpl implements Library {
	private String name;
	private int maxBooks;
	private String[] usernames = new String[10];
	private int maxID;

	/**
	 * Constructor
	 *
	 * @param the Library's name
	 */
	public LibraryImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getID(String username) {
		if (maxID == 0) {
			return setUsername(maxID, username);
		}
		int id = alreadyRegistered(username);
		if (id > -1) {
			return id;
		} else {
			if (maxID == usernames.length - 1) {
				expandUsernames();
			}
			return setUsername(maxID, username);
		}
	}

	private int setUsername(int id, String name) {
		usernames[id] = name;
		maxID++;
		return id;
	}

	@Override
	public void setMaxBooksPerUser(int maxBooks) {
		if (maxBooks < 0) {
			this.maxBooks = 0;
		} else {
			this.maxBooks = maxBooks;
		}
	}
	
	@Override
	public int getMaxBooksPerUser() {
		return maxBooks;
	}

	private int alreadyRegistered(String username) {
		int id = -1;
		for (int i = 0; i < maxID; i++) {
			if (usernames[i].equals(username)) {
				id = i;
			}
		}
		return id;
	}

	private void expandUsernames() {
		String[] newArray = new String[maxID * 2];
		copyArrays(usernames, newArray);
		usernames = newArray;
	}
	
	private void copyArrays(String[] from, String[] to) {
		for(int i = 0; i < from.length; i++) {
			to[i] = from[i];
		}
	}
}