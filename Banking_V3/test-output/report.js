$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "below are the steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on  login",
  "keyword": "And "
});
formatter.match({
  "location": "Step.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_can_view_the_dashboard()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Your store. Login]\u003e but was:\u003c[admin-demo.nopcommerce.com]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat Step_Defination.Step.user_can_view_the_dashboard(Step.java:118)\r\n\tat ✽.User can view the dashboard(file:Features/Customer.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Add a customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_click_on_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on add new customer page",
  "keyword": "And "
});
formatter.match({
  "location": "Step.click_on_add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_enter_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can view confirmation message \"the new user has been added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "below are the steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on  login",
  "keyword": "And "
});
formatter.match({
  "location": "Step.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_can_view_the_dashboard()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Your store. Login]\u003e but was:\u003c[admin-demo.nopcommerce.com]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat Step_Defination.Step.user_can_view_the_dashboard(Step.java:118)\r\n\tat ✽.User can view the dashboard(file:Features/Customer.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Search Customer by EmailID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_click_on_customers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_click_on_customers_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "Step.enter_customer_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on search btton",
  "keyword": "When "
});
formatter.match({
  "location": "Step.click_on_search_btton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should found email in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_should_found_email_in_the_search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});