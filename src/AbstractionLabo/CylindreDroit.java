package AbstractionLabo;

public class CylindreDroit extends Forme3D{
    private double hauteur;
    private Forme2D base;

    public CylindreDroit(double hauteur, Forme2D base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public double volume() {
       return base.aire() * hauteur;
    }

    @Override
    public String toString() {
        return "CylindreDroit{" +
                "hauteur=" + hauteur +
                ", base=" + base.toString() +
                '}';
    }
}
