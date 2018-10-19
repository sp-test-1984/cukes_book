package nicebank;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        Money amount = new Money(dollars, 0);
        account.debit(amount);
        cashSlot.dispense(dollars);
    }
}