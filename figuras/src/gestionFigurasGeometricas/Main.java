package gestionFigurasGeometricas;

public class Main {
    public static void main(String[] args){
        Circulo circulo = new Circulo("azul",3,5);
        Rectangulo rectangulo = new Rectangulo("rojo",8, 5, 10);
        Triangulo triangulo = new Triangulo ("verde", 5, 3,2);
        System.out.println("El area del circulo es: ");
        System.out.println(circulo.calcularArea());
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