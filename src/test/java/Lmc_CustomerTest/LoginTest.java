package Lmc_CustomerTest;

import org.testng.annotations.Test;
import Lmc_CustomerPages.AddToCartPage;
import Lmc_CustomerPages.CheckoutPage;
import Lmc_CustomerPages.LoginPage;
import baseclass.BaseLmc;
import configPropertyFile.Config_Properties;
import utilities.FileLib;
import utilities.Groups;
import utilities.webActionDriver;

public class LoginTest extends BaseLmc
{
	private static webActionDriver webactionDriver;
	private static FileLib fileLib; 
	public static String url;
	public AddToCartPage addToCartPage;
	public CheckoutPage checkoutPage;
	public LoginPage loginPage;
	
	public LoginTest() 
	{
		addToCartPage = new AddToCartPage();
		checkoutPage = new CheckoutPage();
		loginPage = new LoginPage();
		
		webactionDriver = new webActionDriver();
		fileLib=new FileLib();
	}
	
	@Test(groups = Groups.LMCP0)
	public void loginTest() throws Throwable
	{
		
		url = fileLib.getPropertyData(Config_Properties.URL);
		webactionDriver.getURL(url);
		addToCartPage.restaurantLanding();
		addToCartPage.selectItem();
		checkoutPage.checkout();
		loginPage.login();
	}
}
