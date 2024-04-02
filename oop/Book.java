package oop;

public class Book {

    int isbn;
    String title;
    String author;
    double price;

    public Book() {

    }

    public Book(int isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void showBook() {
        System.out.println("ISBN:" + isbn);
        System.out.println("Title :" + title);
        System.out.println("Author : " + author);
        System.out.printf("Price:%.2f\n", price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.isbn = 123123;
        b1.title = "OOP in Java";
        b1.author = "Bhoj Raj Joshi ";
        b1.price = 500;
        b1.showBook();

        Book b2 = new Book(456789, "Java for Beginners", "Mr. Smith ", 300.00);
        b2.showBook();
    }

}