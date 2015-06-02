package ua.dreger.patterns.factory.simple;
/**
 * Created by Sergey on 02.06.2015.
 */
public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
