/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Mirko
 */
public abstract class Odgovornost {

    public Odgovornost sledeci;
    private int iznos;

    public Odgovornost(Odgovornost sledeci, int iznos) {
        this.sledeci = sledeci;
        this.iznos = iznos;
    }

    public abstract void vratiMojuPlatu();

    public void vratiSvojuPlatu() {
        this.vratiMojuPlatu();
        if (sledeci != null) {
            sledeci.vratiMojuPlatu();
        }
    }

}
