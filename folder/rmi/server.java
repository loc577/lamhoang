/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.Naming;
/**
 *
 * @author ASUSTUFGAMING
 */
public class server {
    public static void main(String[] args) throws Exception{
        tongtichimplement tt = new tongtichimplement();
        Naming.rebind("rmi://localhost/tt",tt);
        System.out.println("serverda san sang he he");
    }
}
