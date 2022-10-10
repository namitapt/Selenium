package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","\\Selenium\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
