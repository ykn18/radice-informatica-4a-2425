package com.isradice.esercizioscuolagui;

/**
 *
 * @author ykn18
 */
public class Docente extends Utente {
    private String materia;

    public Docente(String materia, String nome, String cognome) {
        super(nome, cognome);
        this.materia = materia;
    }
    
    public String getNominativo(){
        return "Prof. " + nome + " " + cognome;
    }
}
