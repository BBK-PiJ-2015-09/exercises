
import java.util.Scanner;

public class Text2Number { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your value: ");
        String str = System.console().readLine();
        String output = "";
        char character;
        int counter = 0;
        Boolean carryFive = false;
        while (counter < str.length()) {
            character = str.charAt(counter);	
	if (character == '0') {
                if (carryFive) {
                    output = output + '5';
                    carryFive = false;
                } else {
                    if (counter != 0) {
                        output = output + '0';
                    }
                }
            } else if (character == '1') {
                if (carryFive) {
                    output = output + '5';
                    carryFive = true;
                } else {
                    if (counter != 0) {
                        output = output + '0';
                    }
                    carryFive = true;
                }
            } else if (character == '2') {
                if (carryFive) {
                    output = output + '6';
                    carryFive = false;
                } else {
                    output = output + '1';
                }
            } else if (character == '3') {
                if (carryFive) {
                    output = output + '6';
                    carryFive = true;
                } else {
                    output = output + '1';
                    carryFive = true;
                }
            } else if (character == '4') {
                if (carryFive) {
                    output = output + '7';
                    carryFive = false;
                } else {
                    output = output + '2';
                }
            } else if (character == '5') {
                if (carryFive) {
                    output = output + '7';
                    carryFive = true;
                } else {
                    output = output + '2';
                    carryFive = true;
                }
            } else if (character == '6') {
                if (carryFive) {
                    output = output + '8';
                    carryFive = false;
                } else {
                    output = output + '3';
                }
            } else if (character == '7') {
                if (carryFive) {
                    output = output + '8';
                    carryFive = true;
                } else {
                    output = output + '3';
                    carryFive = true;
                }
            } else if (character == '8') {
                if (carryFive) {
                    output = output + '9';
                    carryFive = false;
                } else {
                    output = output + '4';
                }
            } else if (character == '9') {
                if (carryFive) {
                    output = output + '9';
                    carryFive = true;
                } else {
                    output = output + '4';
                    carryFive = true;
                }
            } else if (character == '.') {
                output = output + '.';
            } else {
            }
            counter++;
        }
        if (carryFive) {
            if (noDecimal(output)) {
                output = output + '.';
            }
            output = output + '5';
        }
        System.out.println(output);
    }

    private static Boolean noDecimal(String output) {
        Boolean decimal = false;
        int stringCounter = 0;
        while (stringCounter < output.length() && !decimal) {
            if (output.charAt(stringCounter) == '.') {
                decimal = true;
            }
            stringCounter++;
        }
        return !decimal;
    }
}