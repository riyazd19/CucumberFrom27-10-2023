package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginParam {
	ChromeDriver driver=null;

	@Given("user opens up the browser")
	public void user_opens_up_the_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");

		throw new io.cucumber.java.PendingException();
	}

	@And("navigates to facebook url")
	public void navigates_to_facebook_url() throws InterruptedException {
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("APjFqb")).sendKeys("www.facebook.com");
		System.out.println("noW hitting the enter");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

		throw new io.cucumber.java.PendingException();
	}

	@When("^user enters (.*) and (.*) done$")
	public void user_enters_name1_and_pass1(String username, String password) {

		throw new io.cucumber.java.PendingException();
	}

	@And("users click on login")
	public void users_click_on_login() {

		throw new io.cucumber.java.PendingException();
	}
	@Then("user should be logged in facebook")
	public void user_should_be_logged_in_facebook() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
