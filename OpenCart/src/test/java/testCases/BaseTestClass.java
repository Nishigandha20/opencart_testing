package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	public String randomeString() {

		String gen_string = RandomStringUtils.randomAlphabetic(5);
		return gen_string;
	}

	public String randomeNumber() {

		String gen_randomNumber = RandomStringUtils.randomAlphanumeric(10);
		return gen_randomNumber;
	}
	
	public String randomAlphaNumeric() {
		String gen_string = RandomStringUtils.randomAlphabetic(3);
		String gen_randomNumber = RandomStringUtils.randomAlphanumeric(3);
		return (gen_string +"@"+gen_randomNumber);

	}
}
