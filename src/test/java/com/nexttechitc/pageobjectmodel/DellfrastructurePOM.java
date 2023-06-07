package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellfrastructurePOM {

	WebDriver driver;
	public DellfrastructurePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
	  // @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   
	  WebElement act_itinfrastructure;
	   
	  public WebElement itinfrastructure (){
	  return act_itinfrastructure;
}
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/a")
	   
	  WebElement click_devloper;
	   
	  public WebElement devlop (){
	  return click_devloper ;  
	  }
	  
}