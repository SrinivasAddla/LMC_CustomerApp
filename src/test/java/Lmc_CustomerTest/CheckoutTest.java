package Lmc_CustomerTest;

import org.testng.annotations.Test;

import Lmc_CustomerPages.AddToCartPage;
import Lmc_CustomerPages.CheckoutPage;
import baseclass.BaseLmc;
import configPropertyFile.Config_Properties;
import utilities.FileLib;
import utilities.webActionDriver;

public class CheckoutTest extends  BaseLmc 
{
	private static webActionDriver webactionDriver;
	private static FileLib fileLib; 
	public static String url;
	
	public AddToCartPage addToCartPage;
	public CheckoutPage checkoutPage;
	
	public CheckoutTest() 
	{
		addToCartPage = new AddToCartPage();
		checkoutPage = new CheckoutPage();
		webactionDriver = new webActionDriver();
		fileLib=new FileLib();
	}
	
	@Test
	public void addToCartTest() throws Throwable
	{
		
		url = fileLib.getPropertyData(Config_Properties.URL);
		webactionDriver.getURL(url);
		addToCartPage.restaurantLanding();
		addToCartPage.selectItem();
		checkoutPage.checkout();
		
	}
}
