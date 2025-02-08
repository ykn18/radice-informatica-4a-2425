package com.isradice.cerchioexceptiongui;

/**
 *
 * @author ykn18
 */
public class RaggioNonValidoException extends Exception {

    @Override
    public String getMessage() {
        return "Raggio non valido"; 
    }
    
}
