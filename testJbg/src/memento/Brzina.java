/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Mirko
 */
public class Brzina {

    private String brzina;

    public void set(String brzina) {
        this.brzina = brzina;
    }

    public Memento setMemento(){
        return new Memento(brzina);
    }
    
    public String restoreFromMemento(Memento m){
        return m.getBrzina();
    }
    
}
