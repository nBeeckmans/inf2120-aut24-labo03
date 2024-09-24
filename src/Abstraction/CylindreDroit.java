package Abstraction;

public class CylindreDroit extends Forme3D {
    private Forme2D base;
    private double hauteur;

    public CylindreDroit(Forme2D base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double volume() {
        return base.aire() * hauteur;
    }

    @Override
    public String toString() {
        return "Abstraction.CylindreDroit{" +
                "base=" + base.toString() +
                ", hauteur=" + hauteur +
                '}';
    }
}
