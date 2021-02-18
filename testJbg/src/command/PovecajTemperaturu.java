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
public class PovecajTemperaturu implements Komanda {

    Kotao k;

    public PovecajTemperaturu(Kotao k) {
        this.k = k;
    }

    @Override
    public void execute() {
        k.povecaj();
    }
}
