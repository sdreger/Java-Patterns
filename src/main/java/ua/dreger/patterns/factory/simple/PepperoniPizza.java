package ua.dreger.patterns.factory.simple;

/**
 * Created by Sergey on 02.06.2015.
 */
public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
