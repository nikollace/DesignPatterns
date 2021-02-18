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
public class PizzaStore {
    public static void main(String[] args) {
         // create new margherita pizza 
        Pizza pizza = new Srbijana(); 
        System.out.println( pizza.getDescription() + 
                         " Cena :" + pizza.getCost()); 
  
        // create new FarmHouse pizza 
        Pizza pizza2 = new Kapricoza(); 
  
        // decorate it with freshtomato topping 
        pizza2 = new ChiliSos(pizza2); 
  
        //decorate it with paneer topping 
        pizza2 = new GovedjiPreliv(pizza2); 
  
        System.out.println( pizza2.getDescription() + 
                        " Cena :" + pizza2.getCost()); 
    }
}
