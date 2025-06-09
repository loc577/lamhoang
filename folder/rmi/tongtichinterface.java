package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface tongtichinterface extends Remote{
    public int tong(int n) throws RemoteException;
    public int tich(int n) throws RemoteException;
    
}
