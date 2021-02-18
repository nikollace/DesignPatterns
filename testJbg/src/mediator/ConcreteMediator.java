/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class ConcreteMediator implements Mediator {

    boolean status;
    Airbus airbus;
    Pista pista;
////    List<Letelica> letelice = new ArrayList<>();
////
////    @Override
////    public void landing() {
////        for (Letelica let : letelice) {
////            if (let.isLandingOk()) {
////                System.out.println(let.name() + " prepared for landing");
////            } else {
////                System.out.println(let.name() + " NOT prepared for landing");
////            }
////        }
////    }
//
//    public void dodajLetelicu(Letelica l) {
//        letelice.add(l);
//    }

    @Override
    public void setLandingStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void registerAirbus(Airbus air) {
        airbus = air;
    }

    @Override
    public void registerPista(Pista pis) {
        pista = pis;
    }

    @Override
    public boolean landing() {
        return status;
    }

}
