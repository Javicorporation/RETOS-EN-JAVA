package com.contadorpalabras;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalabras {
    public static void main(String[] args) {
        contarPalabras("Juanin es el mejor personaje de el  mundo de lucia ");

    }

    public static void contarPalabras(String palabra) {

        Map<String, Integer> palabras = new HashMap<>();

        String[] palabraArray = palabra.toLowerCase()
                .replaceAll("[^a-z0-9]"," ")
                .split("\\s+");

        for(String key : palabraArray) {
            if (key.isEmpty()) {
                continue;
            }
            palabras.put(key, palabras.getOrDefault(key,0) + 1);

        }
        for(Map.Entry<String, Integer> entry : palabras.entrySet()){
            System.out.println(entry.getKey()+" se ha repetido "+entry.getValue()+
                    (entry.getValue() == 1? " vez ":" veces"));

        }



    }
}
