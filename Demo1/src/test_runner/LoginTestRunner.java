package test_runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.PIMPage;
import Pages.loginPage;
import Setup.setup;
import utils.Utils;

public class LoginTestRunner extends setup {
	loginPage LoginPage;
	PIMPage pimpage;
	@BeforeTest
	public void doLogin() throws FileNotFoundException, IOException, ParseException {
		setup.setBrowser();
		 LoginPage=new loginPage(driver);
		 JSONObject userobj= Utils.loadJSONFile("C:\\Users\\Admin\\eclipse-workspace\\Demo1\\resources\\user.json");
		 String username=(String) userobj.get("username");
		 
		 String password=(String) userobj.get("password");
		 LoginPage.doLogin(username, password);
		 
		 
	}
/*	@Test(priority=1,description="User can create employee")
		
	public void createEmployee1() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
		pimpage=new PIMPage(driver);
		String username="Ravi"+Utils.generateRandonNumber(10, 99);
		String password="Ravi123";
		String EmpId="0"+Utils.generateRandonNumber(100, 999);
		Faker faker = new Faker();
		
		String firstname=faker.name().firstName();
		
		String middlename=faker.name().nameWithMiddle();
		String lastname=faker.name().lastName();
	     
		pimpage.CreateEmployee(firstname, middlename, lastname, username, password, EmpId);
        Thread.sleep(2000);
		String actual_header=driver.findElement(By.xpath("//a[@class='orangehrm-tabs-item --active']")).getText();
		String Expected_header="Personal Details";
				Assert.assertTrue(actual_header.contains(Expected_header));
				Utils.addJsonArray(firstname, middlename, lastname, username, password, EmpId);
				
	}*/
	@Test(priority=2)
	public void createEmployee2() throws InterruptedException, FileNotFoundException, IOException, ParseException {
	pimpage=new PIMPage(driver);
	String username="Sagar"+Utils.generateRandonNumber(10, 99);
	String password="Sagar123";
	String empId="0"+Utils.generateRandonNumber(100, 999);
	Faker faker=new Faker();
    String firstname=faker.name().firstName();
    String middlename=faker.name().nameWithMiddle();
    String lastname=faker.name().lastName();
    pimpage.CreateEmployee(firstname, middlename, lastname, username, password, empId);
    Thread.sleep(2000);
    String actual_header=driver.findElement(By.xpath("//a[@class='orangehrm-tabs-item --active']")).getText();
	String Expected_header="Personal Details";
			Assert.assertTrue(actual_header.contains(Expected_header));
	Utils.addJsonArray(firstname, middlename, lastname, username, password, empId);
	
	}
	 @Test(priority=3)
	 public void SerachbyEmpName() throws InterruptedException {
		 pimpage=new PIMPage(driver);
		 String Empname="Darrick";
		 
		 pimpage.SearchEmployeeByValidName(Empname);
		 
	 }
	@Test(priority=4)
	public void SearchByEmpid() throws InterruptedException {
		pimpage=new PIMPage(driver);
		String Empid="0625";
		pimpage.SearchEmployeeByNewId(Empid);
	}

}
