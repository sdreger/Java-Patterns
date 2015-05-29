package ua.dreger.patterns.observer;

/**
 * Created by Sergey on 29.05.2015.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
