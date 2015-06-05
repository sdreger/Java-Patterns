package ua.dreger.patterns.adapter;

/**
 * Created by Sergey on 05.06.2015.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
