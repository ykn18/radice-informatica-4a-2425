package com.isradice.magazzinobrico;

import java.io.Serializable;

/**
 *
 * @author ykn18
 */
public class Prodotto implements Serializable{
    private String nome;
    private double prezzoPerUnita;
    
    public Prodotto(String nome, double prezzoPerUnita) throws PrezzoNonValidoException{
        this.nome = nome;
        if(prezzoPerUnita < 0){
            throw new PrezzoNonValidoException();
        }
        this.prezzoPerUnita = prezzoPerUnita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzoPerUnita() {
        
        return prezzoPerUnita;
    }

    public void setPrezzoPerUnita(double prezzoPerUnita) throws PrezzoNonValidoException{
        if(prezzoPerUnita < 0){
            throw new PrezzoNonValidoException();
        }
        this.prezzoPerUnita = prezzoPerUnita;
    }
    
    
}
