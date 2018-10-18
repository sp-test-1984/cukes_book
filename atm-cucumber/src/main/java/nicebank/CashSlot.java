package nicebank;

public class CashSlot {
    int contents;

    public int contents() {
        return contents;
    }

    public void dispense(int dollars) {
        this.contents = dollars;
    }
}
