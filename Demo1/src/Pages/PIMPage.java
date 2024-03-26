package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
   WebElement addBtn;
	
	@FindBy(xpath="//a[@class='oxd-brand toggled']")
	WebElement pimBtn;
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
	WebElement Searchlist;
	@FindBy(name="firstName")
	WebElement txtfirstname;
	
	@FindBy(name="middleName")
	WebElement txtmiddlename;
	
	@FindBy(name="lastName")
	WebElement txtlastname;
	
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
     WebElement togglebtn;
	
	@FindBy(tagName="input")
	public 
	List<WebElement>txtInput;
	
	@FindBy(tagName="input")
	public 
	List<WebElement>txtEmployeeId;
	
	@FindBy(css="[type=submit]")
	public 
	WebElement saveBtn;
	
	@FindBy(css="[type=submit]")
	public WebElement searchBtn;
	
	//WebDriver driver;
	public PIMPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
		
	}
	
	public void CreateEmployee(String firstName,String middleName,String lastName,String userName, String password,String empId) throws InterruptedException {
		Thread.sleep(5000);
		
	//	pimBtn.click();
		
		addBtn.click();
		txtfirstname.sendKeys(firstName);
		txtmiddlename.sendKeys(middleName);
		txtlastname.sendKeys(lastName);
		txtEmployeeId.get(5).sendKeys(Keys.CONTROL + "a");
		txtEmployeeId.get(5).sendKeys(empId);
		togglebtn.click();
		
		
		txtInput.get(7).sendKeys(userName);
		txtInput.get(10).sendKeys(password);
		txtInput.get(11).sendKeys(password);
		saveBtn.click();
		
	}
public void SearchEmployeeByNewId(String EmpId) throws InterruptedException {
	Searchlist.click();
	txtEmployeeId.get(1).sendKeys(EmpId);
    Thread.sleep(1500);
    searchBtn.click();
}
public void SearchEmployeeByValidName(String EmpName) throws InterruptedException {
	txtfirstname .sendKeys(EmpName);
    Thread.sleep(1500);
    searchBtn.click();
}
	
	
	
}
