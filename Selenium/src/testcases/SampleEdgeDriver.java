package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleEdgeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		//driver.close();
	}

}
