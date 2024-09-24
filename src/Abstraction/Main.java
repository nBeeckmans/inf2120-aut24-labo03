package Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forme3D> formes = new ArrayList<>();

        formes.add(new CylindreDroit(new Cercle(1.0), 1.0));
        formes.add(new CylindreDroit(new Rectangle(2,2), 15));

        Forme2D formeCommune = new Rectangle(1,2);

        formes.add(new CylindreDroit(formeCommune, 3));
        formes.add(new CylindreDroit(formeCommune, 30));

        formes.add(new Sphere(18));

        // pour chaque element
        for (Forme3D forme : formes) {
            System.out.println(forme);
        }

        // On verra plus tard pourquoi la syntaxe ici marche.
        formes.forEach(System.out::println);
        formes.stream().parallel().forEach(System.out::println);

        double volumeTotal = 0.0;
        for (Forme3D forme : formes) {
            volumeTotal += forme.volume();
        }
        System.out.println("Le volume total est de : " + volumeTotal);

    }
}