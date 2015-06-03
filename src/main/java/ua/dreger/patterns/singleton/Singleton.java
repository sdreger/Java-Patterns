package ua.dreger.patterns.singleton;

/**
 * Created by Sergey on 03.06.2015.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
