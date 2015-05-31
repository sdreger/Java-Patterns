package ua.dreger.patterns.decorator;

/**
 * Created by Sergey on 31.05.2015.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

}
