
import java.util.Scanner;

public class BinaryAndDecimal { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(power(2,4));
        System.out.println(power2(2));
    }

    private static int power(int base, int exponent) {
        int result = 0;
        while (exponent > 0) {
            result += (base * base);
            exponent--;
        }
        return result;
    }

    private static int power2(int exponent) {
        return power(exponent, exponent);
    }
}