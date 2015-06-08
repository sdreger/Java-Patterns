package ua.dreger.patterns.state;

/**
 * Created by Sergey on 08.06.2015.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
