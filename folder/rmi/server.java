package rmi;
import java.rmi.Naming;

public class server {
    public static void main(String[] args) throws Exception{
        tongtichimplement tt = new tongtichimplement();
        Naming.rebind("rmi://localhost/tt",tt);
        System.out.println("serverda san sang he he");
    }
}
