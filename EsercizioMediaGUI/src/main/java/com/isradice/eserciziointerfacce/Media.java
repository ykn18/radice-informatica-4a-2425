package com.isradice.eserciziointerfacce;

/**
 *
 * @author ykn18
 */
public class Media {
    private int anno;
    private String nomeAlbum;

    public Media(int anno, String nomeAlbum) {
        this.anno = anno;
        this.nomeAlbum = nomeAlbum;
    }

    public int getAnno() {
        return anno;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }
    
    
}
