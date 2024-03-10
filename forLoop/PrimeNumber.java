
//wap to display if the given number is prime or not.

package forLoop;

import java.util.Scanner;

public class PrimeNumber {
    // public static void main(String[] args) {
    // int num, flag = 0;
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the num :");
    // num = sc.nextInt();

    // for (int i = 1; i < num; i++) {
    // if (num % i == 0) {
    // flag++;
    // break;
    // }
    // }

    // if (flag == 2) {
    // System.out.println("The number is prime");
    // } else {
    // System.out.println("The number is not prime");
    // }

    // sc.close();
    // }
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num :");
        num = sc.nextInt();

        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num!=1 && num!=2) {
            System.out.println("The number is prime");
        } else {
            
            System.out.println("The number is not prime");
        }

        sc.close();
    }
}
