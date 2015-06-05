package ua.dreger.patterns.adapter;

/**
 * Created by Sergey on 05.06.2015.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
