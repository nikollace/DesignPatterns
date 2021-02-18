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
public class MainChain {
    public static void main(String[] args) {
        Odgovornost o=new MirkoZecic(new NikolaDjordjevic(null, 100), 101);
        o.vratiSvojuPlatu();
    }
}
