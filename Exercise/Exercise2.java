// Write a java program to calculate area of circle.

package Exercise;

public class Exercise2 {
    public static float calculateArea(float radius){
        float area=22/7 * radius *radius; 
        return area;
    }

    public static void main(String[] args) {
        float r =5.00f;
        System.out.print("The area of circle is : ");
        System.out.println(calculateArea(r));
    }
}
