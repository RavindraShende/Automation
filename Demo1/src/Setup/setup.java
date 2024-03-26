   package Setup;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
	
	
	/*
	 * @BeforeTest public void set() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Admin\\eclipse-workspace\\Demo1\\driver\\chromedriver.exe");
	 * //WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
	 * driver.get("https://amazon.in"); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 * 
	 * }
	 * 
	 * @Test public void veriftitle() { String actualTitle=driver.getTitle(); String
	 * exceptedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	 * ;
	 * 
	 * Assert.assertEquals(actualTitle, exceptedTitle); }
	 * 
	 * @Test public void logoverify() {
	 * 
	 * boolean flag=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	 * 
	 * Assert.assertTrue(flag); }
	 * 
	 * 
	 * @AfterMethod public void teardown() {
	 * 
	 * 
	 * }
	 */
	public static WebDriver driver;
     @BeforeTest
	public static void setBrowser() {
	
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\git\\repository\\Demo1\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 
		
		
	}
	//@AfterTest
//	public void closeDriver() {
//		driver.close();
//	}
	
	
	
	
	
	
}
