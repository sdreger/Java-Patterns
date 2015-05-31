package ua.dreger.patterns.decorator;

/**
 * Created by Sergey on 31.05.2015.
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return .99;
    }
}
