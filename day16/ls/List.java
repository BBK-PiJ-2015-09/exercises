import java.io.File;

public class List {

	public static void main(String[] args) {
		try {
			File file = new File("./");
			String[] paths = file.list();
			for(int i = 0; i < paths.length; i++) {
				System.out.println(paths[i]);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}