/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Mirko
 */
public class BridgeMain {
    public static void main(String[] args) {
        Proizvedi p=new Proizvedi();
        Sklopi s=new Sklopi();
        
        Auto a=new Auto(p, s);
        Bus b=new Bus(p, s);
        
        a.proizvodnja();        
        System.out.println("");
        b.proizvodnja();
    }
}
