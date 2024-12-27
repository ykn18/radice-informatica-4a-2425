package com.isradice.eserciziodipendente;

/**
 *
 * @author ykn18
 */
public class Impiegato extends Dipendente {
    private String ufficio;

    public Impiegato(String ufficio, String nominativo, String genere, String indirizzo) {
        super(nominativo, genere, indirizzo);
        this.ufficio = ufficio;
    }

    public String getUfficio() {
        return ufficio;
    }

    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    @Override
    public String toString() {
        return "Impiegato{" + "ufficio=" + ufficio + '}';
    }
}
