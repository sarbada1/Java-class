package array;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0; 
        int[] num = new int[5]; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
             
        }
        
        System.out.println("The numbers you entered are:");
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            sum += num[i];
        }
        
        System.out.println("The sum of the numbers is: " + sum);

        sc.close();
    }
}
