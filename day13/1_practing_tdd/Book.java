public interface Book {
	
	/**
	 * Returns the Author's name.
	 * The name is set at construction time and never modified afterwards.
	 *
	 * @return the Author's name
	 */
	public String getAuthor();
	
	/**
	 * Returns the Book's Title. 
	 * The title is set at construction time and never modified afterwards.
	 *
	 * @return the Book's Title
	 */		
	public String getTitle();
			
}
	