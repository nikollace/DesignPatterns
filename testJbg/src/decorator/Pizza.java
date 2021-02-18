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
public abstract class Pizza {
    String description = "Unkknown Pizza"; 
  
    public String getDescription() 
    { 
        return description; 
    } 
  
    public abstract int getCost(); 
}
