package com.isradice.divisioneexceptiongui;

/**
 *
 * @author ykn18
 */
public class DivisionePerZeroException extends Exception {

    @Override
    public String getMessage() {
        return "Attenzione, non si può dividere un numero per zero";
    }
    
}
