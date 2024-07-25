package anagrama;

import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) {
        if(esAnagrama("reeoma","aeemor")){
            System.out.println("Son anagramas");
        }else{
            System.out.println("No es anagrama");
        }
       
        
    }
    
    public static boolean esAnagrama(String palabra1, String palabra2){
        
        // convertimos las palabras a minusculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
                
        //convertimos un string en un array
        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();
        
        //ordenar los array de forma ordenada
        // solo ordena ints y chart
        Arrays.sort(arrayPalabra1);        
        Arrays.sort(arrayPalabra2);
        
        // equals sirve para comparar arrays

        return Arrays.equals(arrayPalabra1, arrayPalabra2);
        
    }
    
}
