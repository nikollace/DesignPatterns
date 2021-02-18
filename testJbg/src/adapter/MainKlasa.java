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
public class MainKlasa {

    public static void main(String[] args) {
        AudiKmh audikmh = new AudiKmh();
        AutomobilMs msVozilo = new AutomobilKmhAdapter(audikmh);

        System.out.println("Max brzina u ms: " + msVozilo.getMaxSpeedMs());
    }
}
