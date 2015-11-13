public class TestSpy {

	public static void main(String[] args) {
		System.out.println("First spy:");
		Spy spy = new Spy(101);
		System.out.println("Second spy:");
		Spy spy1 = new Spy(102);
		spy.die();
	}

}