package gestionFigurasGeometricas;
import java.awt.Point;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, Point posicion, double base, double altura) {
        super(color, posicion);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea (){
        return base * altura;
    }

    public double calcularPerimetro (){
        return (base + altura) * 2;
    }
}
