
import java.util.Scanner;

public class Distance { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Point point_a = new Point();
        Point point_b = new Point();
        Point point_c = new Point();
        System.out.print("Please enter point a's x value: ");
        String str = System.console().readLine();
        point_a.x = Integer.parseInt(str);
        System.out.print("Please enter point a's y value: ");
        str = System.console().readLine();
        point_a.y = Integer.parseInt(str);
        System.out.print("Please enter point b's x value: ");
        str = System.console().readLine();
        point_b.x = Integer.parseInt(str);
        System.out.print("Please enter point b's y value: ");
        str = System.console().readLine();
        point_b.y = Integer.parseInt(str);
        System.out.print("Please enter point c's x value: ");
        str = System.console().readLine();
        point_c.x = Integer.parseInt(str);
        System.out.print("Please enter point c's y value: ");
        str = System.console().readLine();
        point_c.y = Integer.parseInt(str);
        Double ab = distance(point_a, point_b);
        Double bc = distance(point_b, point_c);
        Double ac = distance(point_a, point_c);
        System.out.println("The closest points are: ");
        if (ab < bc) {
            if (ab < ac) {
                System.out.println("point_a");
                System.out.println("point_b");
            } else {
                System.out.println("point_a");
                System.out.println("point_c");
            }
        } else {
            if (bc < ac) {
                System.out.println("point_b");
                System.out.println("point_c");
            } else {
                System.out.println("point_a");
                System.out.println("point_c");
            }
        }
    }

    private static Double distance(Point a, Point b) {
        return (((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y))).sqrt();
    }
    static class Point {
        double x;
        double y;
    }
}