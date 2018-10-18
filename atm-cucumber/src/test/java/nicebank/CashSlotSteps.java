package nicebank;

import cucumber.api.java.en.Then;
import support.KnowsMyDomain;

import static org.junit.Assert.assertEquals;

public class CashSlotSteps {
    private KnowsMyDomain helper;

    public CashSlotSteps(KnowsMyDomain helper){
        this.helper = helper;
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int dollars) throws Throwable {
        assertEquals("incorrect amount dispensed - ", dollars, helper.getCashSlot().contents());
    }
}
