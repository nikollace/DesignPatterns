/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Mirko
 */
public class Pista extends Letelica {

    private Mediator med;

    public Pista(Mediator med) {
        this.med = med;
    }

    public void sleti() {
        if (med.landing()) {
            System.out.println("Uspesno sleteo.");
            med.setLandingStatus(true);
        } else {
            System.out.println("Ceka na sletanje");
        }
    }

    public void getReady() {
        System.out.println("Spreman na sletanje");
    }

}
