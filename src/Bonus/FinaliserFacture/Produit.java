package Bonus.FinaliserFacture;

public abstract class Produit {

    private double prix;
    private String nom;

    public Produit(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }


    public abstract double prix();

    protected double getPrix() {
        return this.prix;
    }

    @Override
    public String toString() {
       return nom + " coute " + prix;
    }
}
