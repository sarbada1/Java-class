package array;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String[] name = new String[5];
        int[] salary = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the details of 5 employees:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            name[i] = sc.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextInt();
            sc.nextLine();
        }
        
        // Calculate total salary
        int totalSalary = 0;
        for(int i = 0; i < 5; i++) {
            totalSalary += salary[i];
        }
        
        double averageSalary = (double) totalSalary / 5;
        
        int maxSalary = salary[0];
        int minSalary = salary[0];
        for(int i = 1; i < 5; i++) {
            if(salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
            if(salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Maximum Salary: " + maxSalary);
        System.out.println("Minimum Salary: " + minSalary);


        sc.close();
    }
}
