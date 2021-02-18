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
public class Airbus extends Letelica {

    Mediator m;

    public Airbus(Mediator m) {
        this.m = m;
        m.setLandingStatus(true);
    }

    @Override
    void sleti() {
        System.out.println("DOZVOLJENO SLETANJE");
        m.setLandingStatus(true);
    }

}
