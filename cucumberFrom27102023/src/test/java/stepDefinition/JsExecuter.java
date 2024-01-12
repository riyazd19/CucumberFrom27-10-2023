package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecuter {
	@Given("uers opens up the browser")
	public static void uers_opens_up_the_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//jsExecutor.
	    // Write code here that turns the phrase above into concrete actions
		// Java example
		jsExecutor.executeScript("alert('Hello, Mehak How are you today Now give me you know what i mean!');");
		//delayExecution(5000);

//		Thread.sleep(2000);
//		jsExecutor.executeScript("alert('How are you today!');");
//		Thread.sleep(2000);
//		jsExecutor.executeScript("alert('Now give me!');");
//		Thread.sleep(2000);
//		jsExecutor.executeScript("alert('you know what i mean!');");
		

	    throw new io.cucumber.java.PendingException();
	}

	@When("user navigated to {string} and searches for {string} site")
	public void user_navigated_to_and_searches_for_site(String string, String string2) {
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("checks for jsExecuter code in same site")
	public void checks_for_js_executer_code_in_same_site() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user implements some methods related to jsExecuter")
	public void user_implements_some_methods_related_to_js_executer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
