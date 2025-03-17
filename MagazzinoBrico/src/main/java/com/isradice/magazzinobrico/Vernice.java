package com.isradice.magazzinobrico;

/**
 *
 * @author ykn18
 */
public class Vernice extends Prodotto{
    private String colore;
    private int litri;

    public Vernice(String colore, int litri, String nome, double prezzoPerUnita) throws PrezzoNonValidoException {
        super(nome, prezzoPerUnita);
        this.colore = colore;
        this.litri = litri;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getLitri() {
        return litri;
    }

    public void setLitri(int litri) {
        this.litri = litri;
    }
    
    
}
