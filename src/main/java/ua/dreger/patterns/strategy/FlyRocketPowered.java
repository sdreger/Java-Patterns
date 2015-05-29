package ua.dreger.patterns.strategy;

/**
 * Created by Sergey on 27.05.2015.
 */
public class FlyRocketPowered implements FlyBehaviour {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
