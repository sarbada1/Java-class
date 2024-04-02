package polymorphism;

public class DataProcess {
    int a, b;

    void sum() {

    }

    void sum(int a, int b) {
        System.out.println("the sum is " + (a + b));
    }

    void sum(int a, double b) {
        System.out.println("the sum is " + (a + b));

    }

    void sum(double a, double b) {
        System.out.println("the sum is " + (a + b));
    }

    void sum(String[] args) {

    }

    public static void main(String[] args) {
        DataProcess pd = new DataProcess();
        pd.a = 12;
        pd.b = 21;
    }
}
