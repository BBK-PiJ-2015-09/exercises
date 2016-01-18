public class UserImpl implements User {
	private String name;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	};
	
	@Override
	public int getID() {
		return 0;
	};
	
}