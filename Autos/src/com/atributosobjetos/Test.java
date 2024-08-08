package com.atributosobjetos;

public class Test {
    public static void main(String[] args) {

        Motor m = new Motor("FUERUF",200,"mecanico");
        Auto auto1 = new Auto("TYWTUW","Mazda", 20000,"Azul", m);
        System.out.println(m);
        System.out.println(auto1);

    }
}
