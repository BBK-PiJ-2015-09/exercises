
import java.util.Scanner;

public class Rectangles { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.upLeft = new Point();
        myRectangle.downRight = new Point();
        System.out.print("Please enter the top left x value: ");
        String str = System.console().readLine();
        myRectangle.upLeft.x = Integer.parseInt(str);
        System.out.print("Please enter the top left y value: ");
        str = System.console().readLine();
        myRectangle.upLeft.y = Integer.parseInt(str);
        System.out.print("Please enter the bottom right x value: ");
        str = System.console().readLine();
        myRectangle.downRight.x = Integer.parseInt(str);
        System.out.print("Please enter the bottom right y value: ");
        str = System.console().readLine();
        myRectangle.downRight.y = Integer.parseInt(str);
        System.out.println("The perimeter is " + perimeter(myRectangle));
        System.out.println("The area is " + area(myRectangle));
    }

    private static Double perimeter(Rectangle rectangle) {
        return (width(rectangle.downRight.x, rectangle.upLeft.x) * 2) + (height(rectangle.upLeft.y, rectangle.downRight.y) * 2);
    }

    private static Double area(Rectangle rectangle) {
        return width(rectangle.downRight.x, rectangle.upLeft.x) * height(rectangle.upLeft.y, rectangle.downRight.y);
    }

    private static Double width(double max_x, double min_x) {
        return max_x - min_x;
    }

    private static Double height(double max_y, double min_y) {
        return max_y - min_y;
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