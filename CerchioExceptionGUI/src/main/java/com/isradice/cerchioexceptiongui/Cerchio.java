package com.isradice.cerchioexceptiongui;

/**
 *
 * @author ykn18
 */
public class Cerchio {
    private double raggio;
    
    public Cerchio(double raggio) throws RaggioNonValidoException {
        if(raggio <= 0) {
            throw new RaggioNonValidoException();
        }
        this.raggio = raggio;
    } 
    
    public double getArea(){
        return Math.PI * Math.pow(raggio, 2);
    }
    
    public double getPerimetro(){
        return Math.PI * 2 * raggio;
    }
}
