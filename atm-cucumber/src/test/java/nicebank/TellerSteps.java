package nicebank;

import cucumber.api.java.en.When;
import support.KnowsMyDomain;

public class TellerSteps {

    private KnowsMyDomain helper;

    public TellerSteps(KnowsMyDomain helper){
        this.helper = helper;
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
