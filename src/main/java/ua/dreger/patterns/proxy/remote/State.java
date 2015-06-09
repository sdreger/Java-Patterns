package ua.dreger.patterns.proxy.remote;

import java.io.Serializable;

/**
 * Created by Sergey on 08.06.2015.
 */
public interface State extends Serializable{
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
