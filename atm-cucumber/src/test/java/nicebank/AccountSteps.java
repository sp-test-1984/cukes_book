package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
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

}
