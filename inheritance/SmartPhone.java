package inheritance;

public class SmartPhone extends Phone {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SmartPhone()
    {
        
    }
    public SmartPhone(int batteryCapacity, int screenSize, String model, int price) {
        super(batteryCapacity, screenSize);
        this.model = model;
        this.price = price;
    }

    public void showSmartphone() {
        show();
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }

    public void installApp(String appName) {
        System.out.println("Installing app: " + appName);
    }

    public void takePhoto() {
        System.out.println("Taking a photo");
    }
}
