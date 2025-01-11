package com.isradice.esercizioscuolagui;

/**
 *
 * @author ykn18
 */
public class Utente {
    protected String nome, cognome;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public String getNominativo(){
        return nome + " " + cognome;
    }
}
