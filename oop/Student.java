package oop;

public class Student {
    int roll;
    String name, address;
    long phone;

    public void payFees() {
        System.out.println(name + " is Paying fees");
    }
    public void attendClass() {
        System.out.println("Attending class");

    }
    public void read() {
        System.out.println("Reading");

    }
    public void giveExam() {
        System.out.println("Giving exam");

    }

    public static void main(String[] args) {
        Student S= new Student();
        S.name="John";
        S.roll=15;
        S.address = "New York";
        S.phone=98765000;

        S.payFees();

    }
}
