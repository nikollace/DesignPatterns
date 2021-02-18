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
public class OperacijaMod implements IzracunajOstatak{

    @Override
    public int vratiOstatak(int a, int b) { // 10 ,3 ostatak 1
        return a%b;
    }
    
}
