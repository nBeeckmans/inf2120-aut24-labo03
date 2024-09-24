package Bonus.Sealed;

public final class FinalGrandChild extends SealedChild {

    public int delegateWork() {
        return super.work() + 1;
    }
}
