package loop;

import java.util.Scanner;

public class Studentdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll;
        String name;
        float grade;
        String repeat;
        do {
            System.out.println("Enter your name : ");
            name = sc.nextLine();

            System.out.println("Enter your Roll number: ");
            roll = sc.nextInt();
            System.out.println("Enter your grade: ");
            grade = sc.nextFloat();
            sc.nextLine(); 

            // Displaying the student details
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll number: " + roll);
            System.out.println("Grade: " + grade);

            System.out.println(("DO you want to repeat? Press quit to exit and continue to repeat"));
            repeat=sc.nextLine();

        } while ( ! repeat.equals("quit"));
        // System.out.println("Godbye");

        sc.close();
    }
}
