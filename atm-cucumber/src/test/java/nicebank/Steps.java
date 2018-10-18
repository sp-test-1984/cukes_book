package nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import transforms.MoneyConverter;

import static org.junit.Assert.*;

public class Steps {
    private Account myAccount;

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

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        myAccount = new Account();
        myAccount.deposit(amount);

        assertEquals("incorrect account balance - ", amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        Teller teller = new Teller();
        teller.withdrawFrom(myAccount, dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
