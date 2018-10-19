package nicebank;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import support.KnowsMyDomain;
import transforms.MoneyConverter;

import static org.junit.Assert.assertEquals;

public class AccountSteps {
    KnowsMyDomain helper;

    public AccountSteps(KnowsMyDomain helper){
        this.helper = helper;
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        assertEquals("incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }

    @Then("^the balance of my account  should be \\$(\\d+\\.\\d+)$")
    public void the_balance_of_my_account_should_be_$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        assertEquals("incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }

}
