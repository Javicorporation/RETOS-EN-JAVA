package com.invertirCadenas;

public class Test {

    public static void main(String[] args) {
        String cadenaConvertida = invertirCadena("holaMaik");

        System.out.println("el array invertido es: "+cadenaConvertida);
    }




    public static String invertirCadena(String cadena){

        // convertimos la cadena a un array
        char[] arrayCara = cadena.toCharArray();

        // creamos una variable int de inicio en 0
        int inicio = 0;
        // creamos otra variable y obtenemos el ultimo VALOR del array
        int fin = arrayCara.length-1;

        // mientras 0 sea menor a 3
        while (inicio < fin){
            // creamos la variable char temp que toma el caracter en la posicion 0 = inicio
            char temp = arrayCara[inicio];
            // el caracter de la posicion 0 sera igual a el caracter de la posicion 3
            arrayCara[inicio] = arrayCara[fin];
            // el caracter de la posicion 3 sera igual a el caracter de la posicion 0
            arrayCara[fin] = temp;

            //inicio aumenta
            inicio++;
            //fin disminuye
            fin--;
        }
        String inver;
        return inver = new String(arrayCara);
    }

}
