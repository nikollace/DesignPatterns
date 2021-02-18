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
public class Kapricoza extends Pizza{

    public Kapricoza() {
        description = "Kapricoza pizza";
    }

    @Override
    public int getCost() {
        return 45;
    }
    
}
