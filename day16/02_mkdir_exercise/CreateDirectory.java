import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		try {
			String directoryName = "";
			for(int i = 0; i < args.length; i++) {
				directoryName += args[i];
			}
			File file = new File("./" + directoryName);
			file.mkdir();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}