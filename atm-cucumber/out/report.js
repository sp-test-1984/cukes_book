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
  "duration": 156743849,
  "status": "passed"
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
  "duration": 1917050,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat nicebank.Steps.i_request_$(Steps.java:22)\n\tat ✽.When I request $20(nicebank/cash_withdrawal.feature:4)\n",
  "status": "pending"
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