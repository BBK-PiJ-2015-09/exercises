
import java.util.Scanner;

public class LineToColumn { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your text");
        String str = System.console().readLine();
        int counter = 0;
        while (counter < str.length()) {
            if (str.charAt(counter) == ' ') {
                System.out.println("");
            } else {
                System.out.print(str.charAt(counter));
            }
            counter++;
        }
        System.out.println("");
    }
}