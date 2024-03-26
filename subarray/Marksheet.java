package subarray;

import java.util.Scanner;

public class Marksheet {
    // Input a marks of n students for m subjects and display
    public static void main(String[] args) {
        int n,m, marks[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        n = sc.nextInt();
        System.out.println("Enter number of subjects:");
        m = sc.nextInt();
        marks = new int[n][m];
        // this will create an array of given size at runtime
        // this is called dynamic array declaration
        String[] subjects = new String[m];
        String[] students = new String[n];
        // input student names and subject names
        sc.nextLine();  //dummy
        System.out.println("Enter name of students");
        for(int i=0; i<n; i++){
            System.out.print("Student"+(i+1)+": ");
            students[i] = sc.nextLine();
        }
        System.out.println("Enter name of subjects");
        for(int i=0; i<m; i++){
            System.out.print("Subject"+(i+1)+": ");
            subjects[i] = sc.nextLine();
        }
      
        // Input marks
        for(int i=0; i<n; i++){  // i selects student
            System.out.println("Enter marks for "+students[i]+":");
            for(int j=0; j<m; j++){
                System.out.print(subjects[j]+": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // diplay as a marks sheet..
        // display subjects in first line
        System.out.printf("%10s%10s\n%10s"," ","Subjects","Students");
        for(int i=0; i<m; i++){
            System.out.printf("%10s",subjects[i]);
        }
        System.out.printf("%10s","Total\n");
        System.out.println("----------------------------------------------------------");
        int total_marks = 0;
        for(int i=0; i<n; i++){
            System.out.printf("%10s",students[i]);
            total_marks = 0;
            for(int j=0; j<m; j++){
                System.out.printf("%10s",marks[i][j]);
                total_marks += marks[i][j];
            }
            System.out.printf("%10s",total_marks);
            System.out.println();
        }

    }
}