package Lmc_CustomerTest;

import org.testng.annotations.Test;
import Lmc_CustomerPages.AddToCartPage;
import baseclass.BaseLmc;
import configPropertyFile.Config_Properties;
import utilities.FileLib;
import utilities.Groups;
import utilities.webActionDriver;

public class AddToCartTest extends  BaseLmc
{
	private static webActionDriver webactionDriver;
	private static FileLib fileLib; 
	public static String url;
	
	public AddToCartPage addToCartPage;
	
	public AddToCartTest() 
	{
		addToCartPage = new AddToCartPage();
		webactionDriver = new webActionDriver();
		fileLib=new FileLib();
	}
	
	@Test(groups = Groups.LMCP0)
	public void addToCartTest() throws Throwable
	{
		
		url = fileLib.getPropertyData(Config_Properties.URL);
		webactionDriver.getURL(url);
		addToCartPage.restaurantLanding();
		addToCartPage.selectItem();
		
	}
}
