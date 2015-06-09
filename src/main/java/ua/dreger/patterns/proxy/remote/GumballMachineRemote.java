package ua.dreger.patterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Sergey on 09.06.2015.
 */
public interface GumballMachineRemote extends Remote{
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
