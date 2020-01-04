package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithExamplesDefiniftions {
	WebDriver driver;
	
	@When("^step one to enter login page$")
	public void step_one_to_enter_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@Given("^put correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void put_correct_and(String arg1,String arg2){
		
		driver.findElement(By.id("txt_unam")).sendKeys(arg1);
		driver.findElement(By.id("txt_pass")).sendKeys(arg2);
	}

	@Then("^finally click login button$")
	public void finally_click_login_button(){
		driver.findElement(By.id("Button3")).click();
	}
}
