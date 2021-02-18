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
public abstract class vozilo {
    Radionica r1,r2;

    public vozilo(Radionica r1, Radionica r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    
    abstract void proizvodnja();
}
