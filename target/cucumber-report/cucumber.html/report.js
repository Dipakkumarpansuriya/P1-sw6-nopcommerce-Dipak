$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computerpage.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page Test",
  "description": "As a user I want to build my own computer \u0026 add to cart",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7935893500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify Product Arrange In AlphaBatical Order",
  "description": "",
  "id": "computer-page-test;verify-product-arrange-in-alphabatical-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on computerpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Computers and Desktops",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on sort computer and desktop \"6\"",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnComputerpage()"
});
formatter.result({
  "duration": 921652300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnComputersAndDesktops()"
});
formatter.result({
  "duration": 809358300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 38
    }
  ],
  "location": "ComputerPageSteps.iClickOnSortComputerAndDesktop(String)"
});
formatter.result({
  "duration": 183270200,
  "status": "passed"
});
formatter.after({
  "duration": 133100,
  "status": "passed"
});
formatter.uri("electronicspage.feature");
formatter.feature({
  "line": 2,
  "name": "Electronics Page Test",
  "description": "",
  "id": "electronics-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.uri("homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Home Page Test",
  "description": "",
  "id": "home-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.uri("loginpage.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.uri("registerpage.feature");
formatter.feature({
  "line": 2,
  "name": "Register Test",
  "description": "",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.uri("shoppingcartpage.feature");
formatter.feature({
  "line": 2,
  "name": "Shopping CartPage Test",
  "description": "",
  "id": "shopping-cartpage-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
});