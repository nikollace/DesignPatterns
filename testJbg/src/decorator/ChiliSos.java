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
public class ChiliSos extends Prilozi{
    
    Pizza pizza;

    public ChiliSos(Pizza pizza) {
        this.pizza = pizza;
    }
   

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chili sos";
    }
    
    public int getCost(){
        return 5 + pizza.getCost();
    }
    
}
