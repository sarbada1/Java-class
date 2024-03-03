// develop a menu based program to display services offered by library to user

import java.util.Scanner;

public class MenuSelect {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Library Management System\n");
        System.out.println("Services we provide in library\n");
        System.out.print("\n1.View Books\n2.Issue Book\n3.Return Book\n4.Search Book\n5.User Information\n6.Create user\n");
        System.out.println("Enter the number you want services of : ");

        n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("You have clicked on view books. We are listing books list. \n");
                break;
            case 2:
                System.out.println("You have clicked on issued books. You will be issued a book. \n");
                break;
            case 3:
                System.out.println("Book is returned back. Thank you for returning the book.\n");
                break;
            case 4:
                System.out.println("You can search your books now. \n");
                break;
            case 5:
                System.out.println("Information of user is shown below. \n");
                break;
            case 6:
                System.out.println("New user is created \n");
                break;

        }
        sc.close();

    }
}