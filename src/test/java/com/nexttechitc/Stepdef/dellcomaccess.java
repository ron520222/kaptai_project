package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.dellcomaccessPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class dellcomaccess {
	WebDriver driver;
	
	@Given("^person visits Dell homepage$")
	public void person_visits_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	    
		   // how to open URL
		    driver.get("https://www.dell.com/");
		                Thread.sleep(3000);
		                //max window
		                
		                driver.manage().window().maximize();    
		
			
		}
	@When("^person go to Computer and Accesories dropdown menu and able to see monitor product$")
	public void person_go_to_Computer_and_Accesories_dropdown_menu_and_able_to_see_monitor_product() throws Throwable {
		Actions act = new Actions(driver);
		dellcomaccessPOM  obj = new dellcomaccessPOM(driver);
		   act.moveToElement(obj.comaccess()).build().perform();
		obj.monitors().click();
	}

	}



