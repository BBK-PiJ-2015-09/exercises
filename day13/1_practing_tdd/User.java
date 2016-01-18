public interface User {
	
	/**
	 * Returns the User's name.
	 * The name is set at construction time
	 *
	 * @return the User's name
	 */
	public String getName();
	
	/**
	 * Returns the User's ID. 
	 *
	 * @return the User's ID
	 */		
	public int getID();
	
	/**
	 * Registers the user with a library.
	 *
	 * @param library the library to register with
	 */	
	public void register(Library library);
	
	/**
	 * Returns the User's Library. 
	 *
	 * @return the User's Library
	 */		
	public String getLibrary();
}