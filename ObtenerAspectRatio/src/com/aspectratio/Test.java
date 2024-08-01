package com.aspectratio;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Test {

    public static void main(String[] args) {

        // creamos una variable y le asignamos una url
        String imagenURL = "https://i.pinimg.com/564x/3c/71/13/3c711397b06e50f61d03ef1d89c7313b.jpg";

        try {
            // leemos la imagen desde la url
            BufferedImage image = ImageIO.read(new URL(imagenURL));

            // obtenemos las dimenciones de la imagen
            int width = image.getWidth();
            int height = image.getHeight();

            // calcular el aspect ratio por medio del metodo
            String aspectRatio = obtenerAspectRatio(width,height);

            // mostramos resultados
            System.out.println("el aspect ratio es: ");
            System.out.println(aspectRatio);

        }catch (Exception e){
            System.err.println("Error al leer la imagen: "+e.getMessage());
        }
    }

    // metodo para obtener  el aspect ratio
    public static String obtenerAspectRatio(int width , int height){
        int gcd = gcd(width,height);
        int aspectWidth = width / gcd;
        int aspectHeight = height / gcd;

        return aspectWidth+" : "+aspectHeight;
    }

    // metodo gcb
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
