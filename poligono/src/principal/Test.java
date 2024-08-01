package principal;

public class Test {
    public static void main(String[] args) {
        System.out.println("el area del poligono es: "+areaDeUnPoligono(6,9));

    }

    public static double areaDeUnPoligono(double longitudAp, double perimetro){
        return (longitudAp * perimetro)/2;
    }
}
