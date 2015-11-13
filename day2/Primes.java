
import java.util.Scanner;

public class Primes { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double i = 1;
        while (i <= 1000) {
            if ( is_prime(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    private static boolean is_prime(double number) {
        boolean prime = true;
        double divisor = number - 1;
        while (prime == true && divisor > 1) {
            if ( number % divisor == 0) {
                prime = false;
            }
            divisor--;
        }
        return prime;
    }
}