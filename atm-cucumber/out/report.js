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
  "name": "I have deposited $100.00 in my account",
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
formatter.step({
  "line": 6,
  "name": "the balance of my account  should be $80.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "100.00",
      "offset": 18
    }
  ],
  "location": "AccountSteps.i_have_deposited_$_in_my_account(Money)"
});
formatter.result({
  "duration": 152889675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 11
    }
  ],
  "location": "TellerSteps.i_request_$(int)"
});
formatter.result({
  "duration": 351770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "CashSlotSteps.$_should_be_dispensed(int)"
});
formatter.result({
  "duration": 161334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80.00",
      "offset": 38
    }
  ],
  "location": "AccountSteps.the_balance_of_my_account_should_be_$(Money)"
});
formatter.result({
  "duration": 1255041,
  "error_message": "java.lang.AssertionError: incorrect account balance -  expected:\u003c$80.00\u003e but was:\u003c$100.00\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat nicebank.AccountSteps.the_balance_of_my_account_should_be_$(AccountSteps.java:27)\n\tat ✽.And the balance of my account  should be $80.00(nicebank/cash_withdrawal.feature:6)\n",
  "status": "failed"
});
});