package nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import transforms.MoneyConverter;

import static org.junit.Assert.*;

public class Steps {
    private KnowsMyDomain helper;

    public Steps(){
        helper = new KnowsMyDomain();
    }

    class Account {
        Money balance = new Money();

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
            return balance;
        }
    }

    class Teller{
        private CashSlot cashSlot;

        public Teller(CashSlot cashSlot){
            this.cashSlot = cashSlot;
        }

        public void withdrawFrom(Account account, int dollars){
            cashSlot.dispense(dollars);
        }
    }

    class CashSlot{
        int contents;

        public int contents() {
            return contents;
        }

        public void dispense(int dollars){
            this.contents = dollars;
        }
    }

    class KnowsMyDomain{
        private Account myAccount;
        private Teller teller;
        private CashSlot cashSlot;

        public Account getMyAccount() {
            if(myAccount == null)
                myAccount = new Account();
            return myAccount;
        }

        public Teller getTeller(){
            if (teller == null)
                teller = new Teller(this.getCashSlot());
            return teller;
        }

        public CashSlot getCashSlot(){
            if(cashSlot == null)
                cashSlot = new CashSlot();
            return cashSlot;
        }
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        assertEquals("incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        Teller teller = new Teller(helper.getCashSlot());
        teller.withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int dollars) throws Throwable {
        assertEquals("incorrect amount dispensed - ", dollars, helper.getCashSlot().contents());
    }
}
