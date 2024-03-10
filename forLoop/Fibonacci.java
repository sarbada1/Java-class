// Write a java program to display fibonacci series upto n terms

package forLoop;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0, next = 1, n = 5;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        System.out.printf("%d \t %d \t", prev, next);


        for (int i = 0; i < n; i++) {
         
                int sum = prev + next;
                System.out.print(sum + "\t");
                prev = next;
                next = sum;
            
        }
    }
}

