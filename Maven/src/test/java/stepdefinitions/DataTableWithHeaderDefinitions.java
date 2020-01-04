package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDefinitions {
	WebDriver driver;
	@When("^first to enter brm page$")
	public void first_to_enter_brm_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@Given("^after enter name and password$")
	public void after_enter_name_and_password(DataTable arg1){
		List<Map<String,String>> keyvaluepair=arg1.asMaps(String.class, String.class);
		String username=keyvaluepair.get(0).get("username");
		String password=keyvaluepair.get(0).get("password");
		
		driver.findElement(By.id("txt_unam")).sendKeys(username);
		driver.findElement(By.id("txt_pass")).sendKeys(password);
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	}

	@Given("^enter login button$")
	public void enter_login_button(){
		driver.findElement(By.id("Button3")).click();
		// Write code here that turns the phrase above into concrete actions
	}
}
