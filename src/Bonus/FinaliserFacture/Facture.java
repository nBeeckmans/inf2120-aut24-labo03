package Bonus.FinaliserFacture;

import java.util.ArrayList;

public class Facture {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void addProduit(Produit produit) {
        this.produits.add(produit);
    }

    public double getPrixTotal() {
        double prix = 0.0;
        for (Produit produit : produits) {
            prix += produit.prix();
        }
        return prix;
    }
}
