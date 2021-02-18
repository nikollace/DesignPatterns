/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import javax.swing.JCheckBox;

/**
 *
 * @author Nikola
 */
public class CheckBox extends JCheckBox implements Root{
    
    public CheckBox() {
        if(this.isAncestorOf(new Panel()))
            ((Panel)this.getParent()).addComponent(this);
        else{
            MainForm.addComponent(this);
        }
    }

    @Override
    public void showComponentDetails() {
        System.out.println("Hello Iam Check Box.");
    }
    
}
