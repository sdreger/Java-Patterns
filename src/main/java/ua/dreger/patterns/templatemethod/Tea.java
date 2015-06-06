package ua.dreger.patterns.templatemethod;

/**
 * Created by Sergey on 06.06.2015.
 */
public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
