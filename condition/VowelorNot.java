// WAp in java to input a character and display if it is a vowel or not

import java.util.Scanner;

public class VowelorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The entered character is a vowel.");
                break;
            default:
                System.out.println("The entered character is not a vowel.");
                break;
        }
        sc.close();
    }
}
