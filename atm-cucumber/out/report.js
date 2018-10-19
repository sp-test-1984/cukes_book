$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nicebank/cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "cash withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 233573762,
  "status": "passed"
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
  "name": "my account has been credited with $100.00",
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
      "offset": 35
    }
  ],
  "location": "AccountSteps.i_have_deposited_$_in_my_account(Money)"
});
formatter.result({
  "duration": 114573928,
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
  "duration": 8827593962,
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
  "duration": 1493950,
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
  "duration": 79295,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2165434832,
  "status": "passed"
});
formatter.after({
  "duration": 7867990,
  "status": "passed"
});
});