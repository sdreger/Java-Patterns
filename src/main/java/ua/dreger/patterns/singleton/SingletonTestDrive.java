package ua.dreger.patterns.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by Sergey on 03.06.2015.
 */
public class SingletonTestDrive {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

    }
}
