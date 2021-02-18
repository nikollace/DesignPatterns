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
public class Bus extends vozilo{

    public Bus(Radionica r1, Radionica r2) {
        super(r1, r2);
    }

    
    @Override
    void proizvodnja() {
        System.out.println("Autobus");
        r1.radi();
        r2.radi();
    }
    
}
