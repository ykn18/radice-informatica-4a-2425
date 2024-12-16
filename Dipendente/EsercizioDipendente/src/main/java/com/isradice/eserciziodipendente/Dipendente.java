package com.isradice.eserciziodipendente;

/**
 *
 * @author ykn18
 */
public class Dipendente {
    protected String nominativo;
    protected String genere;
    protected String indirizzo;

    //Equivalente al costruttore di default
    public Dipendente(){
    }
    
    public Dipendente(String nominativo, String genere, String indirizzo) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.indirizzo = indirizzo;
    }
    
    //Costruttore di copia
    public Dipendente(Dipendente d){
        this.nominativo = d.getNominativo();
        this.genere = d.getGenere();
        this.indirizzo = d.getIndirizzo();
    }
    
    //Getters e setters
    public String getNominativo() {
        return nominativo;
    }

    public String getGenere() {
        return genere;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Dipendente{" + "nominativo=" + nominativo + ", genere=" + genere + ", indirizzo=" + indirizzo + '}';
    }
}
