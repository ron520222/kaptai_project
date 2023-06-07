package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.XpressMenPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Xpress_men {
	WebDriver driver;
	
	@Given("^users visit Xpress homepage$")
	public void users_visit_Xpress_homepage() throws Throwable {
	  
		//how to open browser
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();
				

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//30 seconds wait
				//how to open url
				
				driver.get("https://www.express.com/");
				Thread.sleep(3000);
				//3000 miliseconds hard wait, 
				//10000 miliseconds is 10 seconds
				//max window will open after 3seconds
				
				driver.manage().window().maximize();
				
				
		
		
	}

	@When("^users click acceptall$")
	public void users_click_acceptall() throws Throwable {
		Actions act = new Actions(driver);
		XpressMenPOM  obj = new XpressMenPOM (driver);
		   act.moveToElement(obj.xpress_men()).build().perform();
		   obj.accept_all().click(); 
	}
	
	
	
	@When("^users go to Men dropdown menu$")
	public void users_go_to_Men_dropdown_menu() throws Throwable {
	  
		Actions act = new Actions(driver);
		XpressMenPOM  obj = new XpressMenPOM (driver);
		   act.moveToElement(obj.xpress_men()).build().perform();
			}

	@Then("^users clicks on Jeans to see the Jeans products$")
	public void users_clicks_on_Jeans_to_see_the_Jeans_products() throws Throwable {
		Actions act = new Actions(driver);
		XpressMenPOM  obj = new XpressMenPOM (driver);
		   act.moveToElement(obj.xpress_men()).build().perform();
		   obj.jeans().click();

	}


}
