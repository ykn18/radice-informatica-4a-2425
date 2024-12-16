package com.isradice.eserciziointerfacce;

/**
 *
 * @author ykn18
 */
public class Vinile extends Media{
    private int diametro;

    public Vinile(int diametro, int anno, String nomeAlbum) {
        super(anno, nomeAlbum);
        this.diametro = diametro;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public String toString() {
        return "Vinile, nomeAlbum: "+ this.getNomeAlbum() +", anno: " + this.getAnno()+", diametro: " + this.diametro;
    }
}
