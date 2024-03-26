package oop;

public class Box {
    int l, b, h;

    public void showVolume() {
        int volume = l * b * h;
        System.out.println("The Volume of box is " + volume);
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.l = 3;
        b1.b = 4;
        b1.h = 5;
        b1.showVolume();

        Box b2 = new Box();
        b2.l = 10;
        b2.b = 2;
        b2.h = 5;
        b2.showVolume();


    }
}