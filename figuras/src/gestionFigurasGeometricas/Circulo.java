package gestionFigurasGeometricas;
import java.awt.*;
import java.awt.Point;

public class Circulo extends Figura{
    private double radio;
    public Circulo(String color, Point posicion, double radio) {
        super(color, posicion);
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return Math.PI * 2 * radio;
    }
}