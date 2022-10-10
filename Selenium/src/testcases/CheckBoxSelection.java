package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://selenium.obsqurazone.com/index.php");
		driver3.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		List<WebElement> elements = driver3.findElements(By.className("check-box-list"));
		
		System.out.println(elements.size());
		
		driver3.findElement(By.id("check-box-three")).click();
		 
		for(int i=0;i<elements.size();i++) {
			if(!elements.get(i).isSelected()) {
			elements.get(i).click();
		}
		}

	}

}
