// Write a java program to compute the following on two given numbers.
// a. Is first number larger than second?
// b. Is first number a positive value?
// c. Is second number an even integer?
// d. Is second number multiple of 5?


package Exercise;
import java.util.Scanner;
public class Exercise1 {

    public static void main(String[] args) {
        int x , y;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x and y :");
        x=sc.nextInt();
        y=sc.nextInt();
       
        System.err.println("Is first number larger than second? " + (x > y));
        System.err.println("Is first number a positive value? " + (x>=0));
        System.err.println("Is second number an even integer? " + (y%2==0));
        System.err.println("Is second number multiple of 5? " + (y%5==0));
        sc.close();
        

    }
    
}
