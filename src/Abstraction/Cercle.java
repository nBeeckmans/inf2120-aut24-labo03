package Abstraction;

public class Cercle extends Forme2D{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "Abstraction.Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
