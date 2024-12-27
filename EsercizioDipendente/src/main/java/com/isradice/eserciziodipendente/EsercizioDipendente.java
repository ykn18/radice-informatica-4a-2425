package com.isradice.eserciziodipendente;

/**
 *
 * @author ykn18
 */
public class EsercizioDipendente {

    public static void main(String[] args) {
        //Dichiarazione array (tutti i campi sono null all'inizio)
        Dipendente[] dipArr = new Dipendente[3];
        //Creazione delle istanze e assegnazione all'array
        dipArr[0] = new Dipendente("Mario Rossi", "M", "Via dei Ciliegi, 15");
        dipArr[1] = new Dipendente(); // Costruttore di default
        dipArr[2] = new Dipendente(dipArr[0]); // Costruttore di copia
        for(Dipendente d: dipArr){
            System.out.println(d); //Metodo toString chiamato implicitamentes
        }
    }
}
