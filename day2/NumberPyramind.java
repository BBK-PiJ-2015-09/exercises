
import java.util.Scanner;

public class NumberPyramind { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        while ( i <= 7) {
            int counter = i;
            while ( counter > 1) {
                System.out.print(i);
                counter = counter - 1;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("\\ldots");
    }
}