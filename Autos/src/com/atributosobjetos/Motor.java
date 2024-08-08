package com.atributosobjetos;

public class Motor {
    private String numero;
    private double cilindraje;
    private String tipo;

    public Motor(String numero, double cilindraje, String tipo) {
        this.numero = numero;
        this.cilindraje = cilindraje;
        this.tipo = tipo;

    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindraje=" + cilindraje +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
