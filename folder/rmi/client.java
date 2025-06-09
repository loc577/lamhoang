package rmi;
import java.rmi.Naming;

public class client {
    public static void main(String[] args) throws Exception{
        tongtichinterface tt = (tongtichinterface) Naming.lookup("rmi://localhost/tt");
        int tong = tt.tong(5);
        int tich = tt.tich(5);
        System.out.println("tong la"+ tong);
        System.out.println("tich la"+tich);
        
    }
}
