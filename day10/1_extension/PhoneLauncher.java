public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone mob = new SmartPhone("NOKIA");
		mob.call("1");
		mob.call("2");
		mob.call("3");
		mob.call("4");
		mob.call("5");
		mob.call("6");
		mob.call("7");
		mob.call("8");
		mob.call("9");
		mob.call("10");
		mob.call("11");
		mob.printLastNumbers();
		mob.findPosition();
		mob.browseWeb("news.ycombinator.com");
		mob.ringAlarm("braying sheep");
		mob.playGame("snake 2");
		mob.call("001234");
		System.out.println(mob.getBrand());
	}

}