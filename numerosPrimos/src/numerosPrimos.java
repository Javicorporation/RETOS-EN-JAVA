public class numerosPrimos {

    // metodo de numeros primos de tipo boolean que tiene un parametro
    public static  boolean esPrimo(int numero){
        // si el numero es menor o igual a 1 "negativo", retorna falso - no es primo
        if(numero <= 1){
            return false;
        }
        // desde 2 en adelante, encontramos la rais cuadrada de numero
        for(int i = 2; i <= Math.sqrt(numero); i++){
            // si numero divisible para i da un residuo de 0 no es primo
            if (numero%i == 0) {
                return false;
            }
        }
        // en caso contrario devolvemos true en los que si son positivos
        return true;
    }

    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */

        // este es el limite de cuantos numeros primos hay hasta el numero 5
        int limite = 5;

        // el for lo empezamos desde 2, y optenemos todos los numeros primos hasta el limite
        for (int i = 2; i <= limite; i++){
            // si, es primo es verdadero imprimimos i y si no lo es pues no
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }


}
