package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDataTableLogin {
	WebDriver driver;

	@Given("user is in browser and searches for facebook")
	public void user_is_in_browser_and_searches_for_facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("till here prog is executing");
		driver.get("https://facebook.com");

		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("login page is displayed and user enters login data")
	public void login_page_is_displayed_and_user_enters_login_data(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		/*
		 * List<Map<String, String>> data: This line declares a list named data that
		 * contains maps where the keys are strings and the values are also strings.
		 * This is a common data structure used for storing tabular data.
		 */
		for (Map<String, String> mapdata : data) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(mapdata.get("Username"));
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(mapdata.get("Password"));
			Thread.sleep(5000);

		} // throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

}
