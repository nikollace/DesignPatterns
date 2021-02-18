/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Mirko
 */
public class Storniran implements Stanje {

    @Override
    public String vratiStanje() {
        return "Racun storniran";
    }

}
