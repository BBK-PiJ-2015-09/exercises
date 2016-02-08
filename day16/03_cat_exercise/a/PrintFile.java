import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintFile {

	public static void main(String[] args) {
		System.out.print("Please enter the full filename: ");
		String filename = System.console().readLine();
		try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File " + filename + " does not exist.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
