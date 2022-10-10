package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeObsquraTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		//driver2.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		//String text = driver2.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/label")).getText();
		//System.out.println(text);
		
		//String title = driver2.getTitle();
		//System.out.println(title);
		
		//driver2.get("https://selenium.obsqurazone.com/check-box-demo.php");
		//driver2.findElement(By.className("form-check-label")).click();
		
		driver2.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement clicking = driver2.findElement(By.xpath("//*[@id=\"inlineRadio21\"]"));
		clicking.click();
		Thread.sleep(3000);
		boolean a = clicking.isSelected();
		System.out.println(a);
		
		
		
		
	}

}
