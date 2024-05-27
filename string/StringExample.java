package string;

public class StringExample {
    public static void main(String[] args) {
        java.lang.String s1 = "Divya";
        // Now you can use methods of the java.lang.String class
        int comparisonResult = s1.compareTo("AnotherString");
        s1.split(s1);
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("OOP in Java");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("Programming");
        System.out.println(sb1.length());
        System.out.println("Comparison result: " + comparisonResult);
    }
}
