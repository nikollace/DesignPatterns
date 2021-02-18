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
public class GovedjiPreliv extends Prilozi{

    Pizza pizza;

    public GovedjiPreliv(Pizza pizza) {
        this.pizza = pizza;
    }
   

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", govedji preliv";
    }
    
    public int getCost(){
        return 7 + pizza.getCost();
    }
    
}
