

public class Largest {
    public static void main(String[] args) {
        int a=10, b=20, c=5;
        if(a>b && a>c){
            System.out.printf("%d is largest", a);
        }
        else if(b>a && b>c){
            System.out.printf("%d is largest", b);
        }
        else{
            System.out.printf(" %d is  largest", c);
        }
    }
}
