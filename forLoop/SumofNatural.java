// Calculate and print the sum of first 100 natural numbers using for loop
package forLoop;
public class SumofNatural {
    public static void main(String[] args) {
        int sum=0;

        for(int i=0;i<=100;i++)
        {
            sum+=i;
        }

        System.out.println("The sum of 100 natural numbers are " + sum);
    }
}
