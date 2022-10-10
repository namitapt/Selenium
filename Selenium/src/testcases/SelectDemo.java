package testcases;
//Drop down
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement selecting = driver2.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
		Select s = new Select(selecting);
		//s.selectByIndex(1);
		//s.selectByVisibleText("Green");
		s.selectByVisibleText("Yellow");
		
		
		/*WebElement multipleSelect = driver2.findElement(By.xpath("//*[@id=\"multi-select-field\"]"));
		Select s2 = new Select(multipleSelect);
		s2.selectByValue("Red");
		s2.selectByValue("Green");
		*/
	}

}
