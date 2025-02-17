package com.isradice.esercizioserializzazionetrasportino;

import java.io.Serializable;

/**
 *
 * @author ykn18
 */
public abstract class Animale implements Serializable {
    private String nome;
    private int eta;
    private float peso;

    public Animale(String nome, int eta, float peso) {
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public abstract String verso();
}
