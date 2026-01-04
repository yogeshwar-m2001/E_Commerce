package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "search")
	private WebElement searchBar;

	@FindBy(id = "submit_search")
	private WebElement searchButton;
	
	@FindBy(className = "product-image-wrapper")
	private WebElement container;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public WebElement getContainer() {
		return container;
	}

}
