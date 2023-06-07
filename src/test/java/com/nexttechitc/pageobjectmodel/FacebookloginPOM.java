package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM {
	WebDriver driver;
	public FacebookloginPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")
	WebElement edit_email;
	public WebElement email() {
	return  edit_email;
	}
	
	

	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")
	 WebElement edit_password;
	 public WebElement password() {
	 return  edit_password;
	     }
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")
	   
	  WebElement click_flogin;
	   
	  public WebElement flogin(){
	  return click_flogin;
	  

	  }
	
}
