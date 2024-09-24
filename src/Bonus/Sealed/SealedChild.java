package Bonus.Sealed;

public sealed class SealedChild extends SealedClass permits FinalGrandChild {

    public int work() {
        return (int) Math.pow(Math.PI, Math.PI);
    }
}
