
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color of rectangle");
    }

    @Override
    public void scale() {
        System.out.println("Scaling the rectangle");
    }
}