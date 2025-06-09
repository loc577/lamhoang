package rmi;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class tongtichimplement extends UnicastRemoteObject implements tongtichinterface{
    protected tongtichimplement() throws RemoteException{
        super();
    }

    @Override
    public int tong(int n) throws RemoteException {
        int sum;
        sum = 0;
        for (int i= 1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }

    @Override
    public int tich(int n) throws RemoteException {
        int mul = 1;
        for(int i = 1;i<=n;i++){
            mul = mul * i;
            }
        return mul;
    }
}
