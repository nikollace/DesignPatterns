/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author Mirko
 */
public interface danNaFakultetu {

    default public void execute() {
        dolazakNaFon();
        aktivnostiNaFonu();
        povratakKuci();
    }

    public void dolazakNaFon();

    public default void aktivnostiNaFonu(){
        System.out.println("\nOdbrna seminarskog iz ps\nIspit iz sugavih paterna");
    }

    public void povratakKuci();
}
