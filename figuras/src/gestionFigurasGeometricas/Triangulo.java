package gestionFigurasGeometricas;
import java.awt.Point;
import java.awt.*;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    public Triangulo(String color, Point posicion, double base, double altura) {
        super(color, posicion);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea (){
        return (base * altura) / 2;
    }


    public double calcularPerimetro (){
        return 0;
    }
}