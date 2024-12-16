package com.isradice.firstproject;

public class EsercizioTimer {
    
    public static void main(String[] args) {
         Timer cottura = new Timer("Cottura pollo", 10);
         cottura.start();
         
         cottura.setTotalTime(5);
         cottura.setName("Cottura patate");
         cottura.start();
    }
}
