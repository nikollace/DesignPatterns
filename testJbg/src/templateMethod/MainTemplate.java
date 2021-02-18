/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author Mirko
 */
public class MainTemplate {

    public static void main(String[] args) {
        danNaFakultetu dnf = new Mirko();
        dnf.execute();
        
        System.out.println("");
        System.out.println("");
        dnf = new Nikola();
        dnf.execute();
    }
}
