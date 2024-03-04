//Write a java program to calculate the sum of n natural numbers.

package loop;

public class DayName {
    public static void main(String[] args) {
        int n , sum = 0;
        n=50;
        while (n>0) {
            sum+=n;
            --n;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum );
    }
}
