package loop;

import java.util.Scanner;

public class Studentdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll;
        String name;
        float grade;

        do {
            System.out.println("Enter your name (type 'quit' to exit): ");
            name = sc.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break; // Exit the loop if the user enters "quit"
            }

            System.out.println("Enter your Roll number: ");
            roll = sc.nextInt();
            System.out.println("Enter your grade: ");
            grade = sc.nextFloat();
            sc.nextLine(); // Consume the newline character left by nextFloat()

            // Displaying the student details
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll number: " + roll);
            System.out.println("Grade: " + grade);

        } while (true); // Infinite loop, exit using break statement

        sc.close();
    }
}
