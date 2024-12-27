package com.isradice.progettoimpiegato;

/**
 *
 * @author ykn18
 */
public class Impiegato {
    private String cognome;
    private String nome;
    private String reparto;
    
    
    public Impiegato(){
    }
    
    public Impiegato(String cognome, String nome, String reparto){
        this.cognome = cognome;
        this.nome = nome;
        this.reparto = reparto;
    }
    
    public void stampa(){
        System.out.println("Nome: " + this.nome + ", Cognome: " + this.cognome + ", Reparto: " + this.reparto);
    }
    /*
    public String stampa(){
        return "Nome: " + this.nome + ", Cognome: " + this.cognome + ", Reparto: " + this.reparto);
    }
    */
}
