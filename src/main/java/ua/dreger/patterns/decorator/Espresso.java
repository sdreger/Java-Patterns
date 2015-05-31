package ua.dreger.patterns.decorator;

/**
 * Created by Sergey on 31.05.2015.
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
