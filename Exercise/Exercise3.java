//  Write a java program to implement four function calculator.

package Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static int plus(int x, int y)
    {
        int add=x+y;
        return add;
    }
    public static int minus(int x, int y)
    {
        int sub=x-y;
        return sub;
    }
    public static int product(int x, int y)
    {
        int multi=x*y;
        return multi;
    }
    public static int division(int x, int y)
    {
        int div=x/y;
        return div;
    }
    public static void main (String[] args)
    {
         int x , y;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x and y :");
        x=sc.nextInt();
        y=sc.nextInt();

        System.err.printf("The sum of %d and %d is %d: \n " ,x, y,  plus(x, y));
        System.err.printf("The difference of %d and %d is %d: \n " ,x, y,  minus(x, y));
        System.err.printf("The product of %d and %d is %d: \n " ,x, y,  product(x, y));
        System.err.printf("The division of %d and %d is %d: \n " ,x, y,  division(x, y));

        sc.close();
    }
    
}
