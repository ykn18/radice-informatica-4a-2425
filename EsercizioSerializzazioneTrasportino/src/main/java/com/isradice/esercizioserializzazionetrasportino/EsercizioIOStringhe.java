package com.isradice.esercizioserializzazionetrasportino;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ykn18
 */
public class EsercizioIOStringhe {
    public static void main(String[] args) {
        ArrayList<Gatto> arr = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("file_input.txt"))){
                String line;
                while((line = br.readLine()) != null){
                    List<String> splitCat = Arrays.asList(line.split(","));
                    Gatto g = new Gatto(splitCat.get(0), splitCat.get(1), Integer.parseInt(splitCat.get(2)), Float.parseFloat(splitCat.get(3)));
                    arr.add(g);
                }
                System.out.println(arr);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
