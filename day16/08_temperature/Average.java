import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util;

public class Average {

	public static void main(String[] args) {
		System.out.print("Please enter the full filename to read from: ");
		String from = System.console().readLine();
		try (BufferedReader in = new BufferedReader(new FileReader(from))) {
			String line;
			while((line = in.readLine()) != null) {
				List<String> temps = Arrays.asList(line.split(","));
				for(int i = 0; i < temps; i++) {
					System.out.println(temps[i]);
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("File " + from + " does not exist.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
