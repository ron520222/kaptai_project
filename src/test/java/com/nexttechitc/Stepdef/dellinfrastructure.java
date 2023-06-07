package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellfrastructurePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class dellinfrastructure {
	
	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	// system.set property(key, value)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//driver= new driver we gonna use
		driver = new ChromeDriver();
    
	   // how to open URL
	    driver.get("https://www.dell.com/");
	                Thread.sleep(3000);
	                //max window
	                
	                driver.manage().window().maximize();    
	
		
	}

	@When("^user go to ITinfrastructure dropdown menu and able to see product$")
	public void user_go_to_ITinfrastructure_dropdown_menu_and_able_to_see_product() throws Throwable {
	
		Actions act = new Actions(driver);
		DellfrastructurePOM  obj = new DellfrastructurePOM(driver);
		   act.moveToElement(obj.itinfrastructure()).build().perform();
		obj.devlop().click();
	}
}
