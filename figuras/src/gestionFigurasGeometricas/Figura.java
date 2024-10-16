package gestionFigurasGeometricas;
import java.awt.Point;

public abstract class Figura implements Dibujable, Movible{

    private String color;
    private Point posicion;

    public Figura(String color, Point posicion) {
        this.color = color;
        this.posicion = posicion;
    }

    public abstract double calcularArea();


    public abstract double calcularPerimetro();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public void dibujar(){
        System.out.println("Estoy dibujando ");
    }

    public void rotable(){
        System.out.println("Estoy rotando ");
    }

    public void moverHorizontalmente(int distancia){
        System.out.println("Estoy moviendo horizontalmente" + distancia);
    }

    public void moverVerticalmente(int distancia){
        System.out.println("Estoy moviendo verticalmente" + distancia);
    }
}