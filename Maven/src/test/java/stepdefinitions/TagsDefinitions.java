package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsDefinitions {
	WebDriver driver;
	@Given("^first to open google page$")
	public void first_to_open_google_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
	}

	@When("^then to enter search box for \"([^\"]*)\"$")
	public void then_to_enter_search_box_for(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^to click search button$")
	public void to_click_search_button() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^finally check result$")
	public void finally_check_result() throws Throwable {
		boolean status=driver.findElement(By.partialLinkText("gopi")).isDisplayed();
		if(status) {
			System.out.println("Results Displayed");
	}
}}
