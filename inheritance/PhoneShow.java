package inheritance;

public class PhoneShow {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBatteryCapacity(4500);
        p1.setScreenSize(120);

        SmartPhone sp1 = new SmartPhone();
        sp1.setModel("Samsung");
        sp1.setBatteryCapacity(5000);
        sp1.setScreenSize(150);
        sp1.setPrice(60000);

        p1.show();
        sp1.showSmartphone();
    }
}


