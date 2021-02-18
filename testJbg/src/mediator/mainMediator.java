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
public class mainMediator {

    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        Airbus sparrow101 = new Airbus(med);
        Pista mainRunway = new Pista(med);
        med.registerAirbus(sparrow101);
        med.registerPista(mainRunway);
        mainRunway.getReady();
        sparrow101.sleti();
        mainRunway.sleti();
    }
}
