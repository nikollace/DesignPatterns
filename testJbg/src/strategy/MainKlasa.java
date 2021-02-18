/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Mirko
 */
public class MainKlasa {

    public static void main(String[] args) {
        IzracunajOstatak rm = new RucnoModovanje();
        System.out.println(rm.vratiOstatak(10, 3));
        
        rm = new OperacijaMod();
        System.out.println(rm.vratiOstatak(10, 4));

    }
}
