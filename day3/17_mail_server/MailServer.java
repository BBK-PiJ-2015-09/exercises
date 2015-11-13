
import java.util.Scanner;

public class MailServer { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to My Mail Server!");
        System.out.print(">>> ");
        String returnAddress = System.console().readLine();
        while (!validReturn(returnAddress) || !validEmail(returnAddress)) {
            if (!validReturn(returnAddress)) {
                System.out.println("Invalid command.");
            }
            if (!validEmail(returnAddress)) {
                System.out.println("Invalid email address.");
            }
            System.out.print(">>> ");
            returnAddress = System.console().readLine();
        }
        System.out.println("OK");
        System.out.print(">>> ");
        String destinationAddress = System.console().readLine();
        while (!validDestination(destinationAddress) || !validDestinationEmail(destinationAddress)) {
            if (!validDestination(destinationAddress)) {
                System.out.println("Invalid command.");
            }
            if (!validDestinationEmail(destinationAddress)) {
                System.out.println("Invalid email address.");
            }
            System.out.print(">>> ");
            destinationAddress = System.console().readLine();
        }
        System.out.println("OK");
        System.out.print(">>> ");
        String dataCommand = System.console().readLine();
        while (!validDataCommand(dataCommand)) {
            if (!validDataCommand(dataCommand)) {
                System.out.println("Invalid command.");
            }
            System.out.print(">>> ");
            dataCommand = System.console().readLine();
        }
        String emailLine = System.console().readLine();
        String emailBody = "";
        while (emailLine.charAt(0) != '.') {
            emailBody = emailBody + "\n";
            emailBody = emailBody + emailLine;
            emailLine = System.console().readLine();
        }
        System.out.println("Sending email...");
        System.out.print("from: ");
        System.out.println(returnAddress.substring(10,returnAddress.length()));
        System.out.print("to: ");
        System.out.println(destinationAddress.substring(8, destinationAddress.length()));
        System.out.println(emailBody);
        System.out.println("...done!");
        String str = "";
        while (!quit(str)) {
            System.out.print(">>> ");
            str = System.console().readLine();
        }
        System.out.println("Bye!");
    }

    private static Boolean quit(String command) {
        if (command.length() < 4) {
            return false;
        } else if (
		command.charAt(0) == 'Q' &&
		command.charAt(1) == 'U' &&
		command.charAt(2) == 'I' &&
		command.charAt(3) == 'T') {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean validReturn(String command) {
        if (command.length() < 10) {
            return false;
        } else if (
		command.charAt(0) == 'M' &&
		command.charAt(1) == 'A' &&
		command.charAt(2) == 'I' &&
		command.charAt(3) == 'L' &&
		command.charAt(4) == ' ' &&
		command.charAt(5) == 'F' &&
		command.charAt(6) == 'R' &&
		command.charAt(7) == 'O' &&
		command.charAt(8) == 'M' &&
		command.charAt(9) == ':') {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean validDestination(String command) {
        if (command.length() < 8) {
            return false;
        }
	else if(
		command.charAt(0) == 'R' &&
		command.charAt(1) == 'C' &&
		command.charAt(2) == 'P' &&
		command.charAt(3) == 'T' &&
		command.charAt(4) == ' ' &&
		command.charAt(5) == 'T' &&
		command.charAt(6) == 'O' &&
		command.charAt(7) == ':') {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean validDataCommand(String command) {
        if (command.length() < 4) {
            return false;
        }
	else if(
		command.charAt(0) == 'D' &&
		command.charAt(1) == 'A' &&
		command.charAt(2) == 'T' &&
		command.charAt(3) == 'A') {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean validEmail(String email) {
        int counter = 11;
        int atCounter = 0;
        Boolean wrongPlaceAt = false;
        while (counter < email.length()) {
            if (counter == 0 || counter == email.length()-1) {
                if (email.charAt(counter) == '@') {
                    wrongPlaceAt = true;
                }
            }
            if (email.charAt(counter) == '@') {
                atCounter++;
            }
            counter++;
        }
        if (!wrongPlaceAt && atCounter == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean validDestinationEmail(String email) {
        int counter = 9;
        int atCounter = 0;
        Boolean wrongPlaceAt = false;
        while (counter < email.length()) {
            if (counter == 0 || counter == email.length()-1) {
                if (email.charAt(counter) == '@') {
                    wrongPlaceAt = true;
                }
            }
            if (email.charAt(counter) == '@') {
                atCounter++;
            }
            counter++;
        }
        if (!wrongPlaceAt && atCounter == 1) {
            return true;
        } else {
            return false;
        }
    }
}