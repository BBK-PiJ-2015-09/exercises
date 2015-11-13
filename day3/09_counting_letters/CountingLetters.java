
import java.util.Scanner;

public class CountingLetters { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your text");
        String str = System.console().readLine();
        int counter = 0;
        int eCounter = 0;
        while (counter < str.length()) {
            if (str.charAt(counter) == 'e') {
                eCounter++;
            }
            counter++;
        }
        System.out.println(eCounter);
    }
}