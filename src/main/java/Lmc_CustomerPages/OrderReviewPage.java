package Lmc_CustomerPages;

import org.openqa.selenium.By;

import utilities.FileLib;
import utilities.webActionDriver;

public class OrderReviewPage 
{
	webActionDriver webactionDriver;
	FileLib fileLib;

	public OrderReviewPage()
	{
		webactionDriver = new webActionDriver();
	}
	
	//order review
	//public static By timeSlot = By.xpath("//div[@class='swiper-button-next']");
	public static By timeSelection = By.xpath("//div[@class='swiper-wrapper']//span");
	public static By continueToPayment = By.xpath("(//button[text()='Continue To Payment'])[last()]");
	
	
	public void orderReview()
	{
		//webactionDriver.getElement(timeSlot).click();
		webactionDriver.selectByList(timeSelection, "02:00 AM - 02:30 AM");
		webactionDriver.getElement(continueToPayment).click();
		
	}
}
