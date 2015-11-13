
import java.util.Scanner;

public class YourChangePlease { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the total cost: ");
        String str = System.console().readLine();
        double totalCost = Double.parseDouble(str);
        System.out.println("Please enter the total paid: ");
        str = System.console().readLine();
        double totalPaid = Double.parseDouble(str);
        Change changeDue = new Change();
        changeDue.total = totalPaid - totalCost;
        System.out.println("The ideal change is: ");
        denominationCheck(changeDue, 20, "\u00a320");
        denominationCheck(changeDue, 10, "\u00a310");
        denominationCheck(changeDue, 5, "\u00a35");
        denominationCheck(changeDue, 2, "\u00a32");
        denominationCheck(changeDue, 1, "\u00a31");
        denominationCheck(changeDue, 0.50, "50p");
        denominationCheck(changeDue, 0.20, "20p");
        denominationCheck(changeDue, 0.10, "10p");
        denominationCheck(changeDue, 0.05, "5p");
        denominationCheck(changeDue, 0.02, "2p");
        denominationCheck(changeDue, 0.01, "1p");
        System.out.println("");
    }

    private static void denominationCheck(Change changeDue, double denomination, String name) {
        while (changeDue.total >= denomination || Math.abs(denomination - changeDue.total) < 0.005) {
            makeChange(changeDue, denomination, name);
        }
    }

    private static void makeChange(Change changeDue, double change, String name) {
        System.out.print(name + " ");
        changeDue.total = changeDue.total - change;
    }
    static class Change {
        double total;
    }
}