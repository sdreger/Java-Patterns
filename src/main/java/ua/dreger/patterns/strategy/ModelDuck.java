package ua.dreger.patterns.strategy;

/**
 * Created by Sergey on 27.05.2015.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
}
