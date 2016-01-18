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
		int id = alreadyRegistered(username);
		if (id > 0) {
			return id;
		} else {
			if (maxID == usernames.length) {
				expandUsernames();
			}
			maxID++;
			usernames[maxID] = username;
			return maxID;
		}
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
		int id = 0;
		for (int i = 0; i <= maxID && id == 0; i++) {
			if (usernames[i] == username) {
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