package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestsellerPOM {
	
	WebDriver driver;//global variable
	
	/*
	   * constructor is not a method but special type of method
	   * 1. Constructor name should be match with classname
	   * 2. it has no return type
	   */
	  //we use constructor to access code from one class to another class
	public bestsellerPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	  // @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   
	  WebElement click_bestseller;
	   
	  public WebElement bestseller(){
	  return click_bestseller;
	  

	  }

}
