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
        public void withdrawFrom(Account account, int dollars){

        }
    }

    class KnowsMyDomain{
        private Account myAccount;
        private Teller teller;

        public Account getMyAccount() {
            if(myAccount == null)
                myAccount = new Account();
            return myAccount;
        }

        public Teller getTeller(){
            if (teller == null)
                teller = new Teller();
            return teller;
        }
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        assertEquals("incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        Teller teller = new Teller();
        teller.withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
