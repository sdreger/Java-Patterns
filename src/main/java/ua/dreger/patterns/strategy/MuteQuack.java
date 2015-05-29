package ua.dreger.patterns.strategy;

/**
 * Created by Sergey on 27.05.2015.
 */
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
