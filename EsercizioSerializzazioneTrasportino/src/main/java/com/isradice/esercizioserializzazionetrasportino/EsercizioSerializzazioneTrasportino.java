

package com.isradice.esercizioserializzazionetrasportino;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ykn18
 */
public class EsercizioSerializzazioneTrasportino {

    public static void main(String[] args) {
        Gatto g = new Gatto("Persiano", "Alfio", 5, 3);
        Trasportino t = new Trasportino(g, 10, 10, 10);
        
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        
        Trasportino t2;
        
        System.out.println("L'eta dell'animale contenuto nel trasportino è " + t.getAnimale().getEta());
    
        try{
            fileOutputStream = new FileOutputStream("savefile.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            objectOutputStream.writeObject(t);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        
        try{
            fileInputStream = new FileInputStream("savefile.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            
            t2 = (Trasportino) objectInputStream.readObject();

            System.out.println("L'eta dell'animale contenuto nel trasportino è " + t2.getAnimale().getEta());

            objectInputStream.close(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
