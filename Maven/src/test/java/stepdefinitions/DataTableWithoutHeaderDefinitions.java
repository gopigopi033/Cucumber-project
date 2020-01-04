package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDefinitions {
	WebDriver driver;
	@When("^to open brm login page$")
	public void to_open_brm_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@Given("^to give valid username and password$")
	public void to_give_valid_username_and_password(DataTable arg1){
		List<String> credentials=arg1.asList(String.class);
		String username=credentials.get(0);
		String password=credentials.get(1);
		driver.findElement(By.id("txt_unam")).sendKeys(username);
		driver.findElement(By.id("txt_pass")).sendKeys(password);
	}

	@Then("^to click login button$")
	public void to_click_login_button(){
		driver.findElement(By.id("Button3")).click();
	}
}
