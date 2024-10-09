package gestionFigurasGeometricas;
import java.awt.Point;


public class Main {

    public static void main(String[] args){

        Circulo circulo = new Circulo("Rojo", new Point(10, 20), 5.0);
        Rectangulo rectangulo = new Rectangulo("rojo",new Point(10, 20), 5, 10);
        Triangulo triangulo = new Triangulo ("verde", new Point(10, 20), 3,2);        

        System.out.println("El area del circulo es: ");
        System.out.println(circulo.calcularArea());
        circulo.dibujar();
        circulo.rotable();
        circulo.moverHorizontalmente(20);
        circulo.moverVerticalmente(20);

        System.out.println("El perimetro del circulo es: ");
        System.out.println(circulo.calcularPerimetro());

        System.out.println("El area del rectangulo es: ");
        System.out.println(rectangulo.calcularArea());

        System.out.println("El perimetro del rectangulo es: ");
        System.out.println(rectangulo.calcularPerimetro());

        System.out.println("El area del triangulo es: ");
        System.out.println(triangulo.calcularArea());
    }
}