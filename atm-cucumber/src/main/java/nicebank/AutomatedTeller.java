package nicebank;

public class AutomatedTeller implements Teller {
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        Money amount = new Money(dollars, 0);
        account.debit(amount);
        cashSlot.dispense(dollars);
    }
}