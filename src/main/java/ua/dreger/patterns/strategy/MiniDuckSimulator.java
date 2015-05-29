package ua.dreger.patterns.strategy;

/**
 * Created by Sergey on 27.05.2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        System.out.println("----- Mallard duck -----");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("----- Model duck -----");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        System.out.println("----- Rocket Model duck -----");
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
