
import java.util.Scanner;

public class InsideOrOutside { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.upLeft = new Point();
        myRectangle.downRight = new Point();
        Point thirdPoint = new Point();
        myRectangle.upLeft.x = getCoord("top left x");
        myRectangle.upLeft.y = getCoord("top left y");
        myRectangle.downRight.x = getCoord("bottom right x");
        myRectangle.downRight.y = getCoord("bottom right y");
        thirdPoint.x = getCoord("third x");
        thirdPoint.y = getCoord("third y");
        System.out.println("The third point " + (inside(thirdPoint, myRectangle) ? "is " : "is not ") + "inside the rectangle.");
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