package ua.dreger.patterns.templatemethod;

/**
 * Created by Sergey on 06.06.2015.
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
