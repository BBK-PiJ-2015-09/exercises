
import java.util.Scanner;

public class Palindrome { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your string: ");
        String str = System.console().readLine();
        boolean strictPalindrome;
        int counter = 0;
        while (counter < str.length() && str.charAt(counter) == str.charAt(str.length()-1-counter)) {
            counter++;
        }
        if (counter == str.length()){
            strictPalindrome = true;
        } else {
            strictPalindrome = false;
        }
        System.out.println(str + (strictPalindrome ? " is" : " is not") + " a strict palindrome!");
    }
}