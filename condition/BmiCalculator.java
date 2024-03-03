//Bmi calculator

import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args) {
        double height,weight,result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        weight = sc.nextDouble();
        System.out.println("Enter your height in meters:");
        height = sc.nextDouble();

        result = weight / (height * height);
        if(result <= 15){  
            System.out.printf("Your BMI is %.2f\nYou are underweight.\n",result);
        }else if(result <= 25){    
            System.out.printf("Your BMI is %.2f\nYou have normal weight.\n",result);
        } else if(result >25){            
            System.out.printf("Your BMI is %.2f\nYou are overweight.\n",result);                                           
        }   
        
        sc.close();

    }
}