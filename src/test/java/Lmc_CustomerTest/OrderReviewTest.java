package Lmc_CustomerTest;

import org.testng.annotations.Test;
import Lmc_CustomerPages.AddToCartPage;
import Lmc_CustomerPages.CheckoutPage;
import Lmc_CustomerPages.DeliveryPage;
import Lmc_CustomerPages.LoginPage;
import Lmc_CustomerPages.OrderReviewPage;
import baseclass.BaseLmc;
import configPropertyFile.Config_Properties;
import utilities.FileLib;
import utilities.webActionDriver;

public class OrderReviewTest extends BaseLmc
{
	private static webActionDriver webactionDriver;
	private static FileLib fileLib; 
	public static String url;
	
	public AddToCartPage addToCartPage;
	public CheckoutPage checkoutPage;
	public LoginPage loginPage;
	public DeliveryPage deliverPage;
	public OrderReviewPage orderReview;
	
	public OrderReviewTest() 
	{
		addToCartPage = new AddToCartPage();
		checkoutPage = new CheckoutPage();
		loginPage = new LoginPage();
		deliverPage = new DeliveryPage();
		orderReview = new OrderReviewPage();
		webactionDriver = new webActionDriver();
		fileLib=new FileLib();
	}
	
	@Test
	public void orderReview() throws Throwable
	{
		url = fileLib.getPropertyData(Config_Properties.URL);
		webactionDriver.getURL(url);
		addToCartPage.restaurantLanding();
		addToCartPage.selectItem();
		checkoutPage.checkout();
		loginPage.login();
		deliverPage.deliveryAddress();
		orderReview.orderReview();
		
	}
}
