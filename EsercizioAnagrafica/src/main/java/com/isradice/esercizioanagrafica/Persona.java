package com.isradice.esercizioanagrafica;

import java.io.Serializable;

/**
 *
 * @author ykn18
 */
public class Persona implements Serializable {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) throws EtaNonValidaException {
        if(eta < 0) throw new EtaNonValidaException();
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + '}';
    }
    
    
}
