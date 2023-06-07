package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterSignupPOM {

	WebDriver driver;
	public TwitterSignupPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/section/div[3]/a/div")
	   
	  WebElement click_create;
	   
	  public WebElement Twitt (){
	  return click_create ;  
	  }
	  @FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/label/div/div[2]/div/input")
		WebElement edit_first_Last_name;
		public WebElement First_Lname() {
		return edit_first_Last_name;
		  }
		
		@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/label/div/div[2]/div/input")
		WebElement edit_phone;
		public WebElement Phone_number() {
		return  edit_phone;
		}
		@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[3]/div/div[1]/select")
		public WebElement click_month;
		    
		      
		 @FindBy(xpath ="//*[@id=\"SELECTOR_2\"]")
		public WebElement click_day;
		        
		        
		 @FindBy(xpath ="//*[@id=\"SELECTOR_3\"]")
		public WebElement click_year;
		 
		 @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
		   
		  WebElement click_create1;
		   
		  public WebElement Twitt1 (){
		  return click_create1 ;  
		  } 
		  
		  @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
		   
		  WebElement click_create2;
		   
		  public WebElement Twitt2 (){
		  return click_create2 ;  
		  } 
		  @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div")
		   
		  WebElement click_signup;
		   
		  public WebElement signup(){
		  return click_signup ;  
		  } 
		 
}
