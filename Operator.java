import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int x,y,result;
        char op;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the value of x and y :");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter the operator  (+, -, * or /): ");
        op=sc.next().charAt(0);
        if (op=='+') {
            result=x+y;
            System.out.println("The sum is " + result);
        }
        else if (op=='-') {
            result=x-y;
            System.out.println("The subtraction is " + result);
        }
        else if (op=='*') {
            result=x*y;
            System.out.println("The multiplication is " + result);
        }
        else if (op=='/') {
            result=x/y;
            System.out.println("The division is " + result);
        }
        else{
            System.out.println("Invalid operator");
        }
        sc.close();



    }
}
