package com.isradice.eserciziostudente;

/**
 *
 * @author ykn18
 */
public class Studente {
    private String cognome;
    private String nome;
    private String codiceFiscale;
    private String matricola;
    
    public Studente(String cognome, String nome, String codiceFiscale, String matricola){
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
    }
    
    public String toString(){
        return "Nome: " + this.nome + ", Cognome: " + this.cognome + ", Codice Fiscale: " + this.codiceFiscale + ", Matricola: " + this.matricola;
    }
}
