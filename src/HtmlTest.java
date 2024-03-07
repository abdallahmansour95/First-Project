import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class HtmlTest {
	
	
	WebDriver driver = new ChromeDriver();
	
	
	
	
	
	@BeforeTest
	
	public void beforeTest() {
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		driver.switchTo().alert().accept();
		
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
	}
	
	
	@Test
	
	public void atTest() throws InterruptedException {
		
		WebElement Email = driver.findElement(By.xpath("/html/body/form/center/label/label/input"));
		WebElement Password =driver.findElement(By.xpath("/html/body/form/center/label/label/label/label/input"));
		WebElement loginButton = driver.findElement(By.name("login"));
		
		Thread.sleep(2000);
		
		Email.sendKeys("man@yahoo.com");
		Thread.sleep(2000);
		Password.sendKeys("@qdjkdjk");
		Thread.sleep(2000);
		
	
		
		
		
		loginButton.click();
		
		
		
		
	}

}
