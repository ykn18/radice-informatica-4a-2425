package com.isradice.esercizioscuolagui;

/**
 *
 * @author ykn18
 */
public class Studente extends Utente  {
    private String classe;

    public Studente(String classe, String nome, String cognome) {
        super(nome, cognome);
        this.classe = classe;
    }
    
    
}
