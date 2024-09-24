package AbstractionLabo;

public class Rectangle extends Forme2D {

    private double base;
    private double hauteur;

    public Rectangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return base * hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }
}
