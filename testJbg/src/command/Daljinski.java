/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Mirko
 */
public class Daljinski {

    Komanda komanda;

    public void izvrsi() {
        komanda.execute();
    }

    public void postaviKomandu(Komanda komanda) {
        this.komanda = komanda;
    }
}
