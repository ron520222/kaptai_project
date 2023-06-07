package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.pageobjectmodel.DellfrastructurePOM;
import com.nexttechitc.pageobjectmodel.bestsellerPOM;
import com.nexttechitc.pageobjectmodel.facebooksignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook_signup {
	
	WebDriver driver;
	
	@Given("^person visiting facebook url$")
	public void person_visiting_facebook_url() throws Throwable {
	
	//how to open browser
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	
	//implicit wait is global wait and soft wait.it is outside the application
	//we used it in between open browser and url, 30seconds wait, max30seconds otherwise timeout
	//explicit wait we use in between web elements
	//web driver wait and explicit wait same 
	//explicit wait soft wait and local wait
	//soft wait is both explicit and implicit, hard wait thread.sleep(2);
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	//hard wait: forceful wait, code: Thread.sleep(20)/20 seconds
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//30 seconds wait
	//how to open url
	
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(3000);
	//3000 miliseconds hard wait, 
	//10000 miliseconds is 10 seconds
	//max window will open after 3seconds
	
	driver.manage().window().maximize();
	
}

	@When("^person enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void person_enter_and_and_valid_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {	    
	try {
		facebooksignupPOM fbsignup = new facebooksignupPOM(driver) ;
		 fbsignup.firstname().sendKeys(arg1);
		 fbsignup.lastname().sendKeys(arg2);
		 fbsignup.email().sendKeys(arg3);
		 fbsignup.email1().sendKeys(arg4);
		 fbsignup.password().sendKeys(arg5);
		 
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 //above is explicit wait up to 20 seconds
}
		catch(Exception e) {
			System.out.println("element not found exception");
		}
		}
	@Then("^person select dropdown Month and dropdown Day and dropdown Year$")
	public void person_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {	  
		facebooksignupPOM type = new facebooksignupPOM(driver) ;

		Select dropdown=new Select (type.click_month);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		Select dropdown1=new Select (type.click_day);
		dropdown1.selectByValue("2");
		Thread.sleep(3000);
		Select dropdown2=new Select (type.click_year);
		dropdown2.selectByVisibleText("2000");
		Thread.sleep(3000);  
		
}
	
	@Then("^person select male and clicks on sign up to create an account$")
	public void person_select_male_and_clicks_on_sign_up_to_create_an_account() throws Throwable {
	
	//Actions act = new Actions(driver); for hover over 
	facebooksignupPOM  obj = new facebooksignupPOM(driver);
	   //act.moveToElement(obj.itinfrastructure()).build().perform(); for hover over
	obj.male().click();
	obj.fsignup().click();
	
}
	}


