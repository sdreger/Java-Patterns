package ua.dreger.patterns.factory.factory_method;

/**
 * Created by Sergey on 02.06.2015.
 */
public class NYStyleCheesePizza  extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
