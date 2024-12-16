

package com.isradice.eserciziostudente;

/**
 *
 * @author ykn18
 */
public class EsercizioStudente {

    public static void main(String[] args) {
        Studente s = new Studente("Greco", "Daniel", "BKDASBDIA", "42424");
        //Le due stampe sono equivalenti
        System.out.println(s.toString());
        System.out.println(s);
    }
}
