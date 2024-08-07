package com.DecimalABinari;

public class Test {
    public static void main(String[] args) {
        int numero = 95;
        String binary = convertirABinario(numero);
        System.out.println("El numero "+numero+", en binario es: "+binary);

    }

    public static String convertirABinario(int decimal){

        if (decimal == 0) {
            return "0";
        }

        // creamos un string  para guardar los numeros
        String binary="";
        // mientras decimal se mayor a 0
        while (decimal > 0){
            int resto = decimal%2;
            binary = resto+binary;
            decimal = decimal/2;
        }
        return binary;
    }
}
