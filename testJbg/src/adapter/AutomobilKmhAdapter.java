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
public class AutomobilKmhAdapter implements AutomobilMs {

    AutomobilKmh auto;

    public AutomobilKmhAdapter(AutomobilKmh auto) {
        this.auto = auto;
    }

    @Override
    public float getMaxSpeedMs() {
        return auto.getMaxSpeedKmh() * 1000 / 3600;
    }

}
