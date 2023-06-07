package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.pageobjectmodel.FacebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook_login {
	
	WebDriver driver;
	
	@Given("^users visiting facebook url$")
	public void users_visiting_facebook_url() throws Throwable {
		//how to open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//30 seconds wait
		//how to open url
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		//3000 miliseconds hard wait, 
		//10000 miliseconds is 10 seconds
		//max window will open after 3seconds
		
		driver.manage().window().maximize();
		
		
		
	}

	@When("^users enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void users_enter_valid_and(String arg1, String arg2) throws Throwable {
		try {
			FacebookloginPOM fblogin = new FacebookloginPOM(driver) ;
			 
			 fblogin.email().sendKeys(arg1);
			 
			 fblogin.password().sendKeys(arg2);
			 
			 WebDriverWait wait=new WebDriverWait(driver, 20);
			 //above is explicit wait up to 20 seconds
	}
			catch(Exception e) {
				System.out.println("element not found exception");
			}
			}  
	

	@Then("^users click on login button to login to the account$")
	public void users_click_on_login_button_to_login_to_the_account() throws Throwable {
		FacebookloginPOM obj = new FacebookloginPOM(driver) ;
		   //act.moveToElement(obj.itinfrastructure()).build().perform(); for hover over
	
		obj.flogin().click();
		
	}   
	}



