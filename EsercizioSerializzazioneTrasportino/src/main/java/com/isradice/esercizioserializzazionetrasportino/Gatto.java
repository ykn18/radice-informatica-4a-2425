package com.isradice.esercizioserializzazionetrasportino;

import java.io.Serializable;

/**
 *
 * @author ykn18
 */
public class Gatto extends Animale implements Serializable {
    private String razza;

    public Gatto(String razza, String nome, int eta, float peso) {
        super(nome, eta, peso);
        this.razza = razza;
    }
    
    public String verso(){
        return "Miao";
    }

    @Override
    public String toString() {
        return "Razza: " + razza + ", nome: " + this.getNome() + ", eta: " + this.getEta() + ", peso: " + this.getPeso();
    }
    
}
