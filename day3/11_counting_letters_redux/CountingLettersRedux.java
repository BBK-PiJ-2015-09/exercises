
import java.util.Scanner;

public class CountingLettersRedux { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please write a text: ");
        String mainText = System.console().readLine();
        char searchChar;
        String history = "";
        Boolean stop = false;
        while ( !stop) {
            searchChar = getInput();
            history = history + searchChar;
            if (repeated(searchChar, history)) {
                stop = true;
            } else {
                countMessage(stringCount(searchChar, mainText));
            }
        }
        endMessage();
    }

    private static char getInput() {
        System.out.print("Which letter would you like to count now? ");
        String letter = System.console().readLine();
        while (letter.length() != 1) {
            System.out.println("Please enter a single letter.");
            System.out.print("Which letter would you like to count now? ");
            letter = System.console().readLine();
        }
        return letter.charAt(0);
    }

    private static Boolean repeated(char searchChar, String text) {
        return stringCount(searchChar, text) > 1;
    }

    private static void countMessage(int count) {
        System.out.println("There are " + count + " in your text.");
    }

    private static int stringCount(char searchChar, String mainText) {
        int resultsCounter = 0;
        int mainTextCounter = 0;
        while (!endOfString(mainTextCounter, mainText)) {
            if(searchChar == mainText.charAt(mainTextCounter)) {
                resultsCounter++;
            }
            mainTextCounter++;
        }
        return resultsCounter;
    }

    private static Boolean endOfString(int counter, String string) {
        return counter >= string.length();
    }

    private static void endMessage() {
        System.out.println("Repeated character. Exiting the program...");
        System.out.println("Thank you for your cooperation. Good bye!");
    }
}