package com.isradice.magazzinobrico;

/**
 *
 * @author ykn18
 */
public class CartaParati extends Prodotto {
    private String descrizione;
    private int metri;

    public CartaParati(String descrizione, int metri, String nome, double prezzoPerUnita) throws PrezzoNonValidoException {
        super(nome, prezzoPerUnita);
        this.descrizione = descrizione;
        this.metri = metri;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getMetri() {
        return metri;
    }

    public void setMetri(int metri) {
        this.metri = metri;
    }
    
    
}
