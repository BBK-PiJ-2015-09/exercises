
import java.util.Scanner;

public class Overlap { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.upLeft = new Point();
        firstRectangle.downRight = new Point();
        Rectangle secondRectangle = new Rectangle();
        secondRectangle.upLeft = new Point();
        secondRectangle.downRight = new Point();
        Point otherPoint = new Point();
        firstRectangle.upLeft.x = getCoord("firstRectangle top left x");
        firstRectangle.upLeft.y = getCoord("firstRectangle top left y");
        firstRectangle.downRight.x = getCoord("firstRectangle bottom right x");
        firstRectangle.downRight.y = getCoord("firstRectangle bottom right y");
        secondRectangle.upLeft.x = getCoord("secondRectangle top left x");
        secondRectangle.upLeft.y = getCoord("secondRectangle top left y");
        secondRectangle.downRight.x = getCoord("secondRectangle bottom right x");
        secondRectangle.downRight.y = getCoord("secondRectangle bottom right y");
        otherPoint.x = getCoord("third x");
        otherPoint.y = getCoord("third y");
        System.out.println("The other point " + (inside(otherPoint, firstRectangle) ? "is " : "is not ") + "inside the first rectangle.");
        System.out.println("The other point " + (inside(otherPoint, secondRectangle) ? "is " : "is not ") + "inside the second rectangle.");
    }

    private static double getCoord(String position) {
        System.out.print("Please enter the " + position + " value: ");
        return Integer.parseInt(System.console().readLine());
    }

    private static Boolean inside(Point point, Rectangle rectangle) {
        if ((point.x >= rectangle.upLeft.x && point.x <= rectangle.downRight.x) && (point.y <= rectangle.upLeft.y && point.y >= rectangle.downRight.y)) {
            return true;
        } else {
            return false;
        }
    }
    static class Point {
        double x;
        double y;
    }
    static class Rectangle {
        Point upLeft;
        Point downRight;
    }
}