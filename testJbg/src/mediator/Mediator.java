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
public interface Mediator {

    public boolean landing();
    public void setLandingStatus(boolean status);
    public void registerAirbus(Airbus air);
    public void registerPista(Pista pis);
}
