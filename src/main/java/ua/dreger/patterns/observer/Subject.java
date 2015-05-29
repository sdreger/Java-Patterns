package ua.dreger.patterns.observer;

/**
 * Created by Sergey on 29.05.2015.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
