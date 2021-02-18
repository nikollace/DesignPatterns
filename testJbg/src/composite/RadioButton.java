/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import javax.swing.JRadioButton;

/**
 *
 * @author Nikola
 */
public class RadioButton extends JRadioButton implements Root{

    public RadioButton() {
        if(this.isAncestorOf(new Panel()))
            ((Panel)this.getParent()).addComponent(this);
        else{
            MainForm.addComponent(this);
        }
    }

    @Override
    public void showComponentDetails() {
        System.out.println("Hello Iam Radio Button.");
    }
    
}
