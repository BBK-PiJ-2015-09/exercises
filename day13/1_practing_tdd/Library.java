public interface Library {
	
	/**
	 * Returns the Library's name.
	 *
	 * @return the Library's name
	 */
	public String getName();
	
	/**
	 * Returns a unique ID for a new user.
	 *
	 * @return a unique ID
	 */
	public int getID();
	
	/**
	 * Set the maximum number of books any user can take out.
	 *
	 * @param max the max number of books per user
	 */
	public void setMaxBooksPerUser(int maxBooks);	
	
	/**
	 * Get the maximum number of books any user can take out.
	 *
	 * @return the max number of books per user
	 */
	public int getMaxBooksPerUser();
	
}