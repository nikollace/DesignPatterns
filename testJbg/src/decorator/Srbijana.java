/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Nikola
 */
public class Srbijana extends Pizza{

    public Srbijana() {
        description = "Srbijana pizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
    
}
