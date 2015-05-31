package ua.dreger.patterns.decorator;

/**
 * Created by Sergey on 31.05.2015.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
