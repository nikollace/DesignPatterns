/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Nikola
 */
public class Panel extends JPanel implements Root{
    
    private final List<Root> employeeList = new ArrayList<>(); 
    
    public Panel() {
        if(this.isAncestorOf(new Panel()))
            ((Panel)this.getParent()).addComponent(this);
        else{
            MainForm.addComponent(this);
        }
    }

    @Override
    public void showComponentDetails() {
        for (Root root : employeeList) {
            root.showComponentDetails();
        }
    }
    
    public void addComponent(Root root) { 
        employeeList.add(root); 
    } 
       
    public void removeComponent(Root root){ 
        employeeList.remove(root); 
    } 
}
