package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver; 

	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in(){
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	}

	@When("^user is the search term is \"([^\"]*)\"$")
	public void user_is_the_search_term_is(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^enter the return key$")
	public void enter_the_return_key(){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^the user should see the search result$")
	public void the_user_should_see_the_search_result(){
	    // Write code here that turns the phrase above into concrete actions
	}
}
    