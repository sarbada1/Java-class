public abstract class Draw {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle();

        // Draw the circle
        circle.draw();
        // Fill color of the circle
        circle.fillColor();
        // Scale the circle
        circle.scale();

        // Create a Rectangle object
        Shape rectangle = new Rectangle();

        // Draw the rectangle
        rectangle.draw();
        // Fill color of the rectangle
        rectangle.fillColor();
        // Scale the rectangle
        rectangle.scale();
    }
}



//object
//super of super
// parent class of all java classses
// implicit parent
// to String()
// equals()
// hashCode()