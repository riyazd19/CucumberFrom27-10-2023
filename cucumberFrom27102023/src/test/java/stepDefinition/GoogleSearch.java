package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("till here prog is executing");
		driver.get("https://demoqa.com/automation-practice-form");

	}

	@When("user first search for google")
	public void user_first_search_for_google() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	//Actions action= new Actions(driver);
		//action.s
		//driver.findElement(By.id("APjFqb")).click();
		//driver.findElement(By.id("APjFqb")).sendKeys("demoqa.com/automation-practice-form");

	}
	@SuppressWarnings("unlikely-arg-type")
	@When("user enters the data in form fields")
	public void user_enters_the_data_in_form_fields(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("firstName")).sendKeys(data.get(0).get(1));
		Thread.sleep(5000);
        
		
	}

	@And("user in the search bar enters some value to search for")
	public void user_in_the_search_bar_enters_some_value_to_search_for() {
		System.out.println("noW hitting the enter");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

	}

	@Then("user is able to see the results")
	public void user_is_able_to_see_the_results() {
		System.out.println("now verifying if user is able to see the results");
		driver.getPageSource().contains("Online Cources");

	}

}
