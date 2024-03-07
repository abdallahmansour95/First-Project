import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class MyTestCases {
	
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	
	
	public void mySetup() throws InterruptedException {
		
		String myURl = "https://www.saucedemo.com/";
		driver.get(myURl);
		driver.manage().window().maximize();
		
		
		
		
		
		
		
	}
	
	
	
	@Test
	
	public void Login() throws InterruptedException {
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		
        WebElement AddToCartFirstItem =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		AddToCartFirstItem.click();
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	
		
		
		
	}
	
	
	
	@AfterTest
	
	public void afterTesing() {
		
		
		
		
		
	}
	
	
	
	
	
	

}
