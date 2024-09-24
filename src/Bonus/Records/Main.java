package Bonus.Records;

public class Main {
    public static void main(String [] args) {
        // soit f  courbe, reel  -> tangeante et reel
        // une fonction pour une courbe donnee et un x donne retourne
        // la derivee et le y correspondant (je sais pas pourquoi quelqu'un voudrait ca)

        Fonction initialle = new Fonction();

        ClasseComposee classeComposee = sansRecord(initialle, 2.0);
        double quelquechose =
                classeComposee.getComposee().apply(classeComposee.y);

        // probleme : -> on peut modifier l'instance !
        classeComposee.y = 2;

        RecordComposee recordComposee = avecRecord(initialle, 2.0);

        double quelqueChoseAutre =
                recordComposee.f.apply(recordComposee.d);

        // illegal ! recordComposee.d = 3.0f;

        // equivalent aux tuples en python !

    }

   private static ClasseComposee sansRecord(Fonction f, double x) {
        return new ClasseComposee(f.getDerivee(), f.getPositionY(x));
   }

   private static RecordComposee avecRecord(Fonction f, double x) {
        return new RecordComposee(f.getDerivee(), f.getPositionY(x));
   }

   private static record RecordComposee (Fonction f, double d) {

   }

   private static class ClasseComposee {
        private Fonction composee;
        private double y;

        public ClasseComposee(Fonction composee, double y) {
            this.composee = composee;
            this.y = y;
        }

       public Fonction getComposee() {
           return composee;
       }

       public void setComposee(Fonction composee) {
           this.composee = composee;
       }

       public double getY() {
           return y;
       }

       public void setY(double y) {
           this.y = y;
       }
   }
}
