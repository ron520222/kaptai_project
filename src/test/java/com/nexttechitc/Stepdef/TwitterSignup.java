package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.pageobjectmodel.TwitterSignupPOM;
import com.nexttechitc.pageobjectmodel.XpressMenPOM;
import com.nexttechitc.pageobjectmodel.facebooksignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterSignup {

	WebDriver driver;
	

	@Given("^users visiting Twitter url and clicks on create account$")
	public void users_visiting_Twitter_url_and_clicks_on_create_account() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("WebDriver.chrome.driver","C:\\Users\\ronny\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		
	
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
		
		driver.get("https://twitter.com/");
		Thread.sleep(3000);
		//3000 miliseconds hard wait, 
		//10000 miliseconds is 10 seconds
		//max window will open after 3seconds
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		TwitterSignupPOM  obj = new TwitterSignupPOM (driver);
		   obj.Twitt().click();

	}

		
	@When("^users enter \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void person_enter_and_valid(String arg1, String arg2) throws Throwable {
		try {
			TwitterSignupPOM fbsignup = new TwitterSignupPOM(driver) ;
			 fbsignup.First_Lname().sendKeys(arg1);
			 fbsignup.Phone_number().sendKeys(arg2);
			 
			 WebDriverWait wait=new WebDriverWait(driver, 20);
			 //above is explicit wait up to 20 seconds
	}
			catch(Exception e) {
				System.out.println("element not found exception");
			}
			}	
		
	

	@When("^users select dropdown Month and dropdown Day and dropdown Year$")
	public void users_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		TwitterSignupPOM twittsignup = new TwitterSignupPOM(driver) ;

		Select dropdown=new Select (twittsignup.click_month);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		Select dropdown1=new Select (twittsignup.click_day);
		dropdown1.selectByValue("2");
		Thread.sleep(3000);
		Select dropdown2=new Select (twittsignup.click_year);
		dropdown2.selectByVisibleText("1990");
		Thread.sleep(3000);  
		
}
	

	@Then("^users clicks on Next and clicks on sign up to create an account$")
	public void users_clicks_on_Next_and_clicks_on_sign_up_to_create_an_account() throws Throwable {
		//Actions act = new Actions(driver);
		TwitterSignupPOM  obj = new TwitterSignupPOM (driver);
		   obj.Twitt1().click();
		   obj.Twitt2().click();
		   obj.signup().click();

	}


}
