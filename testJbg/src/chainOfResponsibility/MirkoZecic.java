/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Mirko
 */
public class MirkoZecic extends Odgovornost{
    
    public MirkoZecic(Odgovornost sledeci, int iznos) {
        super(sledeci, iznos);
    }
    
    public void vratiMojuPlatu(){
        System.out.println("Moja plata je 1000eur");
    }
    
}
