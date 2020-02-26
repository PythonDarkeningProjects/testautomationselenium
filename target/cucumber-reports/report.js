$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginPage/UserSignOn.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Some Description",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Automation"
    }
  ]
});
formatter.scenario({
  "name": "Test Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@CustomTest2"
    }
  ]
});
formatter.step({
  "name": "The Custom Page Is Active",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookSteps.java:28"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the credentials",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookSteps.java:34"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the create campaign button",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookSteps.java:46"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The campaign modal is shown",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookSteps.java:50"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select the first product",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookSteps.java:55"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the Modal continue button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookSteps.java:59"
});
formatter.result({
  "status": "passed"
});
});