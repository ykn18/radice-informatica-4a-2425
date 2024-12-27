package com.isradice.eserciziodipendente;

/**
 *
 * @author ykn18
 */
public class Docente extends Dipendente{
    public static final String prefisso = "Prof. ";
    private String ruolo, disciplina;
    
    public Docente(String ruolo, String disciplina, String nominativo, String genere, String indirizzo){
        super(nominativo, genere, indirizzo);
        this.ruolo = ruolo;
        this.disciplina = disciplina;
    }
    
    public String getRuolo(){
        return ruolo;
    }
    
    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

    public String getDisciplina() {
        return disciplina;
    }
    
    public String getNominativo() {
        return prefisso + nominativo;
    }

    @Override
    public String toString() {
        return "Docente{" + "ruolo=" + ruolo + ", disciplina=" + disciplina + '}';
    }
}
