/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class Repozitorijum {

    public List<forma> lista;
    private static Repozitorijum instance;

    public static Repozitorijum getInstance() {
        if (instance == null) {
            instance = new Repozitorijum();
        }

        return instance;

    }

    private Repozitorijum() {
        lista = new ArrayList<>();
    }

    public void dodaj(forma dij) {
        lista.add(dij);
    }

    public void obavesti(String text) {
        System.out.println(text);
        for (forma jd : lista) {
            jd.obavesti(text);
        }
    }
}
