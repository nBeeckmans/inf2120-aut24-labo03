package Bonus.Sealed;

public class Main {

    public static void main(String [] args) {
        SealedClass sealed = new FinalClass();

        System.out.println(process(sealed));
    }


    public static int process(SealedClass object) {
        // pattern matching
        return switch (object) {
            case FinalClass finalclass -> finalclass.dosmt();
            case FinalGrandChild grandChild -> grandChild.delegateWork();
            case SealedChild sealedChild -> sealedChild.work();
            // pas necessaire mais peut etre utile
            case EnfantPerdu enfantPerdu -> enfantPerdu.hashCode();
            case NonSealedClass nonSealedClass -> nonSealedClass.getNumberOfEnfant();
            // pas de default car on a tous les cas :D
            case SealedClass sealedClass -> '?';
        };

        // equivaut a

        // if (object instanceof FinalClass) {
        //      FinalClass finalClass = (FinalClass) object;
        //      finalClass.dosmt();
        // } else if (object instanceof ... etc
    }

}
