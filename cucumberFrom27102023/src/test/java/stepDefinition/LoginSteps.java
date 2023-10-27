package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		System.out.println("user gives valid credentials");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks on login button");

	}

	@Then("user is navigated to loging home page")
	public void user_is_navigated_to_loging_home_page() {
		System.out.println("user is logged in");

	}
}
