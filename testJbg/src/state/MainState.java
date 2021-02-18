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
public class MainState {

    public static void main(String[] args) {
        Kreiran k = new Kreiran();
        Stanje s = k;
        if (s.vratiStanje().equalsIgnoreCase("racun kreiran")) {
            System.out.println("Uspesno ste kreirali racun");
        }
    }
}
