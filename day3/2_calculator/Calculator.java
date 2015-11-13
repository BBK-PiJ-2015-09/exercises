
import java.util.Scanner;

public class Calculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        double first_number = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double second_number = input.nextDouble();
        System.out.println("Please select your operation!");
        System.out.println("1 -- Addition");
        System.out.println("2 -- Subtraction");
        System.out.println("3 -- Multiplication");
        System.out.println("4 -- Division");
        int operation = input.nextInt();
        if (operation == 1) {
            System.out.println(first_number + second_number);
        } else if (operation == 2) {
            System.out.println(first_number - second_number);
        } else if (operation == 3) {
            System.out.println(first_number * second_number);
        } else {
            System.out.println(first_number / second_number);
        }
    }
}