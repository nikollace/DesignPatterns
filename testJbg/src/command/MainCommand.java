/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Mirko
 */
public class MainCommand {
    
    public static void main(String[] args) {
        Daljinski dalj = new Daljinski();
        dalj.postaviKomandu(new SmanjiTemperaturu(new Kotao()));
        dalj.izvrsi();
        
        dalj.postaviKomandu(new PovecajTemperaturu(new Kotao()));
        dalj.izvrsi();
    }
}
