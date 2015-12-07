public class HanoiTest {

	public static void main(String[] args) {
		int size = 64;
		Hanoi hanoi = new Hanoi(size);
		System.out.println(hanoi.run());
	}

}
