package Abstraction;

public class Sphere extends Forme3D {
    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(rayon, 3);
    }

    @Override
    public String toString() {
        return "Abstraction.Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
