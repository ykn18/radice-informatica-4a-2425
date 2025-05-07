package com.isradice.magazzinobrico;

enum TipoForma{
    Rettangolare,
    Quadrata,
    Esagonale
};
/**
 *
 * @author ykn18
 */
public class Piastrella extends Prodotto{
    private TipoForma forma;
    private double altezza;
    private double larghezza;

    public Piastrella(TipoForma forma, double altezza, double larghezza, String nome, double prezzoPerUnita) throws PrezzoNonValidoException {
        super(nome, prezzoPerUnita);
        this.forma = forma;
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    
    public TipoForma getForma() {
        return forma;
    }

    public void setForma(TipoForma forma) {
        this.forma = forma;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
    
    
}
