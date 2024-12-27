package com.isradice.progettoimpiegato;

import java.util.Scanner;

/**
 *
 * @author ykn18
 */
public class ProgettoImpiegato {

    public static void main(String[] args) {
        String nome, cognome, reparto;
        Impiegato i;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire quanti impiegati si vogliono stampare:");
        int numImpiegati = Integer.parseInt(in.nextLine());
        for(int j = 0; j < numImpiegati; j++){
            System.out.println("Inserire il nome dell'impiegato: ");
            nome = in.nextLine();
            System.out.println("Inserire il cognome dell'impiegato: ");
            cognome = in.nextLine();
            System.out.println("Inserire il reparto dell'impiegato: ");
            reparto = in.nextLine();
            i = new Impiegato(cognome, nome, reparto);
            i.stampa();
        }
    }
}
