import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		System.out.print("Please enter the full filename to copy from: ");
		String from = System.console().readLine();
		System.out.print("Please enter the full filename to copy to: ");
		String to = System.console().readLine();
		try (BufferedReader in = new BufferedReader(new FileReader(from));
			 PrintWriter out = new PrintWriter(to)) {
			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File " + from + " does not exist.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
