package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	ChromeDriver driver;

	@Given("User fires up the laptop and opens the browser")
	public void user_fires_up_the_laptop_and_opens_the_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http//:www.google.com");
		throw new io.cucumber.java.PendingException();
	}

	@When("user first search for google")
	public void user_first_search_for_google() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user in the search bar enters some value to search for")
	public void user_in_the_search_bar_enters_some_value_to_search_for() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the results")
	public void user_is_able_to_see_the_results() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
