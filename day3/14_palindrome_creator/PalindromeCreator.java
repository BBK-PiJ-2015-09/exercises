
import java.util.Scanner;

public class PalindromeCreator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your string: ");
        String str = System.console().readLine();
        String outputStr = str;
        int counter = 0;
        while (counter < str.length()) {
            outputStr = outputStr + str.charAt(str.length()-1-counter);
            counter++;
        }
        System.out.println(outputStr);
    }
}