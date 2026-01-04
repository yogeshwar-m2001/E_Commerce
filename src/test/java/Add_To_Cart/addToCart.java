package Add_To_Cart;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtilities.BaseTest;
import ObjectRepository.HomePage;
import ObjectRepository.ProductsPage;

public class addToCart extends BaseTest {
	@Test
	public void addToCartTest() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.getProductsLink().click();

		ProductsPage productPage = new ProductsPage(driver);
		productPage.getSearchBar().sendKeys("Shirts");
		productPage.getSearchButton().click();

		Actions action = new Actions(driver);
		action.moveToElement(productPage.getContainer()).perform();

		Thread.sleep(2000);
		
	
	}
}
