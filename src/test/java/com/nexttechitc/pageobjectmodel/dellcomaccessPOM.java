package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellcomaccessPOM {
	WebDriver driver;
	public dellcomaccessPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/button")
	  // @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   
	  WebElement act_comaccess;
	   
	  public WebElement comaccess (){
	  return act_comaccess;
}
	//*[@id="unified-masthead-navigation"]/nav/ul/li[2]/ul/li[7]/a
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[3]/a")
	  // @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   
	  WebElement click_monitors;
	   
	  public WebElement monitors (){
	  return click_monitors ;  
	  }
	  
}

