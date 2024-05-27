package Assignment;

public class Driver {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);

        System.out.println("Point 1: ");
        point1.displayPoint();
        System.out.println("Point 2: ");
        point2.displayPoint();

        double distance = Point.calculateDistance(point1, point2);
        System.out.println("Distance between the points: " + distance);
    }
}
