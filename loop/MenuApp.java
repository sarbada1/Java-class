package loop;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        int n;
        String repeat;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to Electricity Billing App\n");

            System.out.print("\n1.View Bill\n2.Pay Bill\n3. View Previous Bill\n4.Report issue\n5.Exit\n");
            System.out.println("Enter your choice : ");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1 ->
                    System.out.println("Your bill amount is Rs.1500. \n");

                case 2 ->
                    System.out.println("You have successfully paid your electricity bill. \n");

                case 3 ->
                    System.out.println("Your previous bill amount is Rs. 3000.\n");

                case 4 ->
                    System.out.println("You have reported your issue \n");
                case 5 ->
                    System.exit(0);

            }
            System.out.println("Do you want to repeat the menu? Type quit to exit : ");
            repeat = sc.nextLine();
        } while (!repeat.equals("quit"));
        System.out.println("You have exited \n");

        sc.close();

    }
}
