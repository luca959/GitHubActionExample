package login_refactor;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLifeCycleSetting {
	
	protected WebDriver driver;
	//prova
	@BeforeAll
	public static void setupClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucaf\\Desktop\\chromedriver.exe");
	}
	
	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		//close the browser
		if (driver != null) {
			driver.quit();
		}
	}

}
