package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Home")
	private WebElement homeLink;

	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement productsLink;

	@FindBy(linkText = "Cart")
	private WebElement cartLink;

	@FindBy(linkText = "Signup / Login")
	private WebElement signup_LoginLink;

	@FindBy(linkText = "Logout")
	private WebElement logoutLink;

	@FindBy(linkText = "Delete Account")
	private WebElement deleteAccountLink;

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getsignup_LoginLink() {
		return signup_LoginLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDeleteAccountLink() {
		return deleteAccountLink;
	}

}
