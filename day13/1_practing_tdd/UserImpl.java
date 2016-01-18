public class UserImpl implements User {
	private String name;
	private Library library;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getID() {
		return library.getID();
	}
	
	@Override
	public void register(Library library) {
	}
	
	@Override
	public String getLibrary() {
		return null;
	}
	
}