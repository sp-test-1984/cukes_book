$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nicebank/cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "cash withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Successful withdrawal from account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have deposited $100 in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I request $20",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "$20 should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 18
    }
  ],
  "location": "Steps.i_have_deposited_$_in_my_account(int)"
});
formatter.result({
  "duration": 161767422,
  "error_message": "java.lang.AssertionError: incorrect account balance expected:\u003c100\u003e but was:\u003c0\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:555)\n\tat nicebank.Steps.i_have_deposited_$_in_my_account(Steps.java:26)\n\tat ✽.Given I have deposited $100 in my account(nicebank/cash_withdrawal.feature:3)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 11
    }
  ],
  "location": "Steps.i_request_$(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "Steps.$_should_be_dispensed(int)"
});
formatter.result({
  "status": "skipped"
});
});