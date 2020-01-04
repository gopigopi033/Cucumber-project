package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBRMDefinitions {
	WebDriver driver;
	@Given("^user is entering the login page$")
	public void user_is_entering_the_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@When("^the user enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_the_valid_and(String username, String password){
		driver.findElement(By.id("txt_unam")).sendKeys(username);
		driver.findElement(By.id("txt_pass")).sendKeys(password);
	}

	@When("^click on the login button$")
	public void click_on_the_login_button(){
		driver.findElement(By.id("Button3")).click();
	}

	@Then("^the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page(){
		System.out.println("Successfully Opened");
	}}
