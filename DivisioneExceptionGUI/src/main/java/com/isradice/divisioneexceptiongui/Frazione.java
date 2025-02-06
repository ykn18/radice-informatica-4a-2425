package com.isradice.divisioneexceptiongui;

/**
 *
 * @author ykn18
 */
public class Frazione {
    private double numeratore;
    private double denominatore;

    public Frazione(double numeratore, double denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    
    public double calcola() throws DivisionePerZeroException {
        if(denominatore == 0){
            throw new DivisionePerZeroException();
        }
        return numeratore/denominatore;
    } 
}
