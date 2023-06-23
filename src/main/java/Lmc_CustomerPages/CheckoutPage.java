package Lmc_CustomerPages;

import org.openqa.selenium.By;

import utilities.FileLib;
import utilities.webActionDriver;

public class CheckoutPage 
{
	webActionDriver webactionDriver;
	FileLib fileLib;

	public CheckoutPage()
	{
		webactionDriver = new webActionDriver();
	}
	
	public static By cartButton = By.xpath("//button[@aria-label='cart']");
	public static By checkoutButtonVerify = By.xpath("(//div[@role='group'])[last()]");
	
	
	public void checkout() throws Exception
	{
		Thread.sleep(2000);
		
		webactionDriver.clickByWebDriverWait(cartButton, 10);
		if(Boolean.parseBoolean(webactionDriver.isElementDisplayed(checkoutButtonVerify)))
		{
				webactionDriver.clickByWebDriverWait(checkoutButtonVerify, 10);	
		}
		else
		{
			System.out.println("Element not");
		}
		
	}
}
