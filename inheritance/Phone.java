package inheritance;

public class Phone {
    private int batteryCapacity; //abstract method
    private int screenSize;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Phone() {

    }

    public Phone(int batteryCapacity, int screenSize) {
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void show() {
        System.out.println("Battery capacity: " + this.batteryCapacity);
        System.out.println("Screen size: " + this.screenSize);
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }
}
