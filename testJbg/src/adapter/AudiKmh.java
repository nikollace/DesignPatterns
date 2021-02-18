/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Mirko
 */
public class AudiKmh implements AutomobilKmh {

    @Override
    public float getMaxSpeedKmh() {
        return 235.5f;
    }

}
