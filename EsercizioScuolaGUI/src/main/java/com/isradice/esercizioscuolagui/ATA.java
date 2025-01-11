package com.isradice.esercizioscuolagui;

/**
 *
 * @author ykn18
 */
public class ATA extends Utente {
    private String ruolo;

    public ATA(String ruolo, String nome, String cognome) {
        super(nome, cognome);
        this.ruolo = ruolo;
    }
    
    public String getNominativo(){
        return "Sig. " + nome + " " + cognome;
    }
    
}
