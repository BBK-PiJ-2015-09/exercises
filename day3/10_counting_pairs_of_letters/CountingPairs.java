
import java.util.Scanner;

public class CountingPairs { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the string you are searching for:");
        String searchStr = System.console().readLine();
        System.out.println("Please enter your searchable text:");
        String mainText = System.console().readLine();
        int mainTextLength = mainText.length();
        int mainTextCounter = 0;
        int resultsCount = 0;
        int searchStrLength = searchStr.length();
        int searchStrCounter = 0;
        Boolean cont = true;
        while (mainTextCounter < mainTextLength) {	
	while(cont == true && searchStrCounter < searchStrLength && mainTextCounter + searchStrCounter < mainTextLength) {
                if(mainText.charAt(mainTextCounter + searchStrCounter) == searchStr.charAt(searchStrCounter)) {
                    searchStrCounter++;
                } else {
                    cont = false;
                }
            }
            if (searchStrCounter == searchStrLength) {
                resultsCount++;
            }
            searchStrCounter = 0;
            mainTextCounter++;
            cont = true;
        }
        System.out.println("'" + searchStr + "' appears " + resultsCount + (resultsCount == 1 ? " time" : " times") + " in '" + mainText + "'");
    }
}