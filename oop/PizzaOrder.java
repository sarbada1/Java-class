/**  this is the program to write about pizza order  */


package oop;

public class PizzaOrder {
    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        numPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;
        } else {
            System.out.println("Maximum limit of pizzas reached the order");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Pizza pizza1= new Pizza("large", 1 ,0,2);
        Pizza pizza2= new Pizza("medium", 1 ,0,2);

        System.out.println("Pizza 1 Description : " + pizza1.getDescription());
        System.out.println("Pizza 2 Description : " + pizza2.getDescription());

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        double totalCost= order.calcTotal();
        System.out.println("Total cost of  Order : Rs " + totalCost);
    }
}
