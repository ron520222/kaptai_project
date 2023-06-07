package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	
	WebDriver driver;
	
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		//how to open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			      driver = new ChromeDriver();
			      
			   // how to open URL
			    driver.get("https://www.Amazon.com/");
			                Thread.sleep(3000);
			                //max window
			                
			                driver.manage().window().maximize();    

}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
	    
	AmazonsearchPOM search=new AmazonsearchPOM(driver);
	search.Amazonsearch().sendKeys(arg1);
	search.searchicon().click();
	
	}

	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
	   
	}


}
