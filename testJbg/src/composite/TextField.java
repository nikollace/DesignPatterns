/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import javax.swing.JTextField;

/**
 *
 * @author Nikola
 */
public class TextField extends JTextField implements Root{
    
    public TextField() {
        if(this.isAncestorOf(new Panel()))
            ((Panel)this.getParent()).addComponent(this);
        else{
            MainForm.addComponent(this);
        }
    }

    @Override
    public void showComponentDetails() {
        System.out.println("Hello Iam Text Field.");
    }
    
}
