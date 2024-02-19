package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class To_Get_Various_Values {
	ChromeDriver driver;
	
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
	    // Write code here that turns the phrase above into concrete actions

	}

	@And("enter the site name")
	public  void enter_the_site_name() {
		System.out.println("just like that");
		
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("when site is displayed get the title")
	public void when_site_is_displayed_get_the_title() {
		String title;
		title=driver.getTitle();
		System.out.println(title);
		//now valdate
		if(title.equals("Automation Exercise"))
			System.out.println("title is correct ");
		else
			System.out.println("title is incorrect");
	    
	    
	}

	@And("get the list of various objects form the site and store them")
	public void get_the_list_of_various_objects_form_the_site_and_store_them() {
	    System.out.println("space one");
	}

	@Then("validate those values againest user provided values")
	public void validate_those_values_againest_user_provided_values() {
	   System.out.println("space two");
	}

}
