package stepdefinitionclassassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definitionCA {
	public static String url = "https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	@Given("open broeser and navigate to login page")
	public void open_broeser_and_navigate_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}
	@When("Enter username {string}")
	public void enter_username(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(string);
	   
	}
	@When("Enter password {string}")
	public void enter_password(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(string);
	}
	@When("Click on login")
	public void click_on_login() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("Redirect in homepage of Guru99")
	public void redirect_in_homepage_of_guru99() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	

}
