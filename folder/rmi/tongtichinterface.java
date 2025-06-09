/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ASUSTUFGAMING
 */
public interface tongtichinterface extends Remote{
    public int tong(int n) throws RemoteException;
    public int tich(int n) throws RemoteException;
    
}
