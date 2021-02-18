/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mirko
 */
public class MainMemento {
    public static void main(String[] args) {
        List<Memento> memi=new ArrayList<Memento>();
        Brzina b=new Brzina();
        
        b.set("brzina je 120");
        memi.add(b.setMemento());
        
        b.set("brzina je 130");
        memi.add(b.setMemento());
        
        b.set("brzina je 140");
        memi.add(b.setMemento());
        
        b.set("brzina je 150");        
        memi.add(b.setMemento());
        
        System.out.println(b.restoreFromMemento(memi.get(3)));
    }
}
