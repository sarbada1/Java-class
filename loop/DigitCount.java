package loop;

import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        int num, rem, count=0,rev=0;
Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num= sc.nextInt();

        while(num>0)
        {
            rem= num%10;
            count++;
            num=num/10;
            rev=rev*10+rem;

        }
        System.out.println("Number of digits in a given number is " + count);
        System.out.println("Reverse of the given number is "+rev);
        sc.close();
    }
}
