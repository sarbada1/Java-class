

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color of circle");
    }

    @Override
    public void scale() {
        System.out.println("Scaling the circle");
    }

    
}
