package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {

    }

    @When("User fill username and password in login page and click on login button")
    public void user_fill_username_and_password_in_login_page_and_click_on_login_button() {
        System.out.println("Step 1");
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {

    }

    @When("User fill username as {string} and invalid {string} in login page and click on login button")
    public void user_fill_username_and_invalid_password_in_login_page_and_click_on_login_button(String username, String password) {
        System.out.println("Step 2");
        System.out.println("The value of username and password are : " + username + " & " + password);
    }

    @Then("Show an error message of password to user and stay in login page")
    public void show_an_error_message_of_password_to_user_and_stay_in_login_page() {

    }

    @When("User fill username without @ and password in login page and click on login button")
    public void user_fill_username_without_and_password_in_login_page_and_click_on_login_button(DataTable table) {
        System.out.println("Step 3");
        String value_1_of_table_1 = table.cell(0, 0);
        String value_2_of_table_1 = table.cell(0, 1);
        String value_1_of_table_2 = table.cell(1, 0);
        String value_2_of_table_2 = table.cell(1, 1);
        System.out.println("In 1th table the value of username is " + value_1_of_table_1 + " and the value of password is " + value_2_of_table_1);
        System.out.println("In 2nd table the value of username is " + value_1_of_table_2 + " and the value of password is " + value_2_of_table_2);
    }

    @Then("Show error message of to be write correctly email")
    public void show_error_message_of_to_be_write_correctly_email() {

    }

    @When("User fill invalid username as {string} and invalid {string} in login page and click on login button")
    public void user_fill_invalid_username_and_invalid_password_in_login_page_and_click_on_login_button(String username, String password) {
        System.out.println("Step 4");
        System.out.println("The value of username in Scenario Outline is : "+username);
        System.out.println("The value of password in Scenario Outline is : "+password);
    }

    @Then("Show error message of to be write correctly email and password")
    public void show_error_message_of_to_be_write_correctly_email_and_password() {

    }
}
