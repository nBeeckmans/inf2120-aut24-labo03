package AbstractionLabo;

public class Cercle  extends Forme2D{

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon + ", "
                + "aire=" + aire() +
                '}';
    }
}
