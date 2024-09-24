package AbstractionLabo;

public class Sphere extends Forme3D{

    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(rayon,3) / 3 ;
    }
}
