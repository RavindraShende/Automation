 package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	@FindBy(name="username")
	 private WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(tagName="p")
	WebElement lvlInvalidCreds;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	WebElement pimBtn;

public loginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
}
public void doLogin(String username,String password) {
txtUserName.sendKeys(username);
txtPassword.sendKeys(password);	
btnLogin.click();
pimBtn.click();
}

public String doLoginWithInvalidCreds(String username, String password) {
	txtUserName.sendKeys(username);
	txtPassword.sendKeys(password);	
	btnLogin.click();
	return  lvlInvalidCreds.getText();
}


}
