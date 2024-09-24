package Bonus.FinaliserFacture;

public class TaxeSimple extends Produit {

    public TaxeSimple(double prix, String nom) {
        super(prix, nom);
    }

    @Override
    public double prix() {
        return getPrix() * 1.05;
    }
}
