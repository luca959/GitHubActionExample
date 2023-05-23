package login_refactor;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverLifeCycleSetting {
	
	protected WebDriver driver;
	//prova
	@BeforeAll
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
		
	}
	
	@BeforeEach
	void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
	}

	@AfterEach
	void teardown() {
		//close the browser
		if (driver != null) {
			driver.quit();
		}
	}

}
