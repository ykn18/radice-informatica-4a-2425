package com.isradice.esercizioserializzazionetrasportino;

import java.io.Serializable;

/**
 *
 * @author ykn18
 */
public class Trasportino implements Pesabile, Serializable {
    private Animale animale;
    private float altezza, larghezza, profondita;

    public Trasportino(Animale animale, float altezza, float larghezza, float profondita) {
        this.animale = animale;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public Animale getAnimale() {
        return animale;
    }

    public void setAnimale(Animale animale) {
        this.animale = animale;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }

    public float getProfondita() {
        return profondita;
    }

    public void setProfondita(float profondita) {
        this.profondita = profondita;
    }
    
    public float getPeso(){
        return altezza * larghezza * profondita * 12;
    }
    
}
