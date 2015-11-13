
import java.util.Scanner;

public class Test { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double dividend = 5;
        double divisor = 2;
        if ( ( dividend % divisor) == 0) {
            System.out.println("It's divisible!");
        } else {
            System.out.println("It's not divisible!");
        }
    }
}