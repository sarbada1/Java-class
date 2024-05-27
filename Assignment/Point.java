//Create a class point which represents a point on a 2-D space. Now create a constructor to create point, a method to display point 
// and a static method to  calculate distance between two points and returns the distance.
// Create a driver class with main method inside which create two objects. Display the poins and distance between those points

package Assignment;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void displayPoint() {
        System.out.println("Point("+x+","+y+")");
    }

    public static double calculateDistance(Point p1, Point p2) {
        int disX = p2.getX() - p1.getX();
        int disY = p2.getY() - p1.getY();
        return Math.sqrt(disX * disX + disY * disY);
    }
}
