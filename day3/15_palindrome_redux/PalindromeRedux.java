
import java.util.Scanner;

public class PalindromeRedux { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your string: ");
        String originalStr = System.console().readLine();
        boolean relaxedPalindrome;
        int counter = 0;
        String str = "";
        while (counter < originalStr.length()) {
            if (Character.isLetter(originalStr.charAt(counter))) {
                str = str + Character.toLowerCase(originalStr.charAt(counter));
            }
            counter++;
        }
        counter = 0;
        while (counter < str.length() && str.charAt(counter) == str.charAt(str.length()-1-counter)) {
            counter++;
        }
        if (counter == str.length()){
            relaxedPalindrome = true;
        } else {
            relaxedPalindrome = false;
        }
        System.out.println(originalStr + (relaxedPalindrome ? " is" : " is not") + " a relaxed palindrome!");
    }
}