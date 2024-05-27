//create a  class named pizza that stores information about a single pizza. It should contain the following:

// Instance variables to store the size of the pizza

package oop;

public class Pizza {
    private String size;
    private int cheeseToppingsCount;
    private int pepperoniToppingsCount;
    private int chickenToppingsCount;

    public Pizza() {

    }

    public Pizza(String size, int cheeseToppingsCount, int pepperoniToppingsCount, int chickenToppingsCount) {
        this.size = size;
        this.cheeseToppingsCount = cheeseToppingsCount;
        this.pepperoniToppingsCount = pepperoniToppingsCount;
        this.chickenToppingsCount = chickenToppingsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return cheeseToppingsCount;
    }

    public void setNumberOfCheeseTopping(int cheeseToppingsCount) {
        this.cheeseToppingsCount = cheeseToppingsCount;
    }

    public int getNumberOfPepperoniTopping() {
        return pepperoniToppingsCount;
    }

    public void getNumberOfPepperoniTopping(int pepperoniToppingsCount) {
        this.pepperoniToppingsCount = pepperoniToppingsCount;
    }

    public int getNumberOfChickenTopping() {
        return chickenToppingsCount;
    }

    public void setNumberOfChickenTopping(int chickenToppingsCount) {
        this.chickenToppingsCount = chickenToppingsCount;
    }

    public double calcCost() {
        double basePrice = 0;
        switch (size.toLowerCase()) {
            case "small":
                basePrice = 100;
                break;
            case "medium":
                basePrice = 120;
                break;
            case "large":
                basePrice = 140;
                break;

            default:
                break;
        }
        return basePrice + 20 * (cheeseToppingsCount + pepperoniToppingsCount + chickenToppingsCount);
    }

    public String getDescription() {
        return " Pizza size : " + size + " , Cheese Toppings : " + cheeseToppingsCount + " , Pepperoni Toppings : "
                + pepperoniToppingsCount + " , Chicken Toppings : " + chickenToppingsCount;
    }
}
