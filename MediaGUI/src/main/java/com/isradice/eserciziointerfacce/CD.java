package com.isradice.eserciziointerfacce;

/**
 *
 * @author ykn18
 */
public class CD extends Media{
    private int capacita;

    public CD(int capacita, int anno, String nomeAlbum) {
        super(anno, nomeAlbum);
        this.capacita = capacita;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return "CD, nomeAlbum: "+ this.getNomeAlbum() +", anno: " + this.getAnno()+", capacità: " + this.capacita;
    }
    
    
    
}
