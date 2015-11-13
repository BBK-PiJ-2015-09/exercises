
import java.util.Scanner;

public class CommandLineCalculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your calculation: ");
        String calculation = input.nextLine();
        boolean operated = false;
        char plus = '+';
        char minus = '-';	
char multiply = '*';
        char divide = '/';
        char operation = '0';
        String first_number = "";
        String second_number = "";
        for (int i = 0; i < calculation.length(); i++){
            char c = calculation.charAt(i);
            if (c == plus) {
                operation = c;
                operated = true;
            } else if ( c == minus) {
                operation = c;
                operated = true;
            } else if ( c == multiply) {
                operation = c;
                operated = true;
            } else if ( c == divide) {
                operation = c;
                operated = true;
            } else {
                if (operated == false) {
                    first_number = first_number + c;
                } else {
                    second_number = second_number + c;
                }
            }
        }
        double first_double = Double.parseDouble(first_number);
        double second_double = Double.parseDouble(second_number);
        if (operation == '+') {
            System.out.println(first_double + second_double);
        } else if (operation == '-') {
            System.out.println(first_double - second_double);
        } else if (operation == '*') {
            System.out.println(first_double * second_double);
        } else {
            System.out.println(first_double / second_double);
        }
    }
}