package GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseTest {

	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
	}

	@BeforeMethod
	public void loginBrowser() {
		HomePage homePage = new HomePage(driver);
		homePage.getsignup_LoginLink().click();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys("yogeshwarmurugesan4@gmail.com");
		loginPage.getPasswordTextField().sendKeys("@Yogesh123");
		loginPage.getLoginButton().click();
	}

	@AfterMethod
	public void logoutBrowser() {
		HomePage homePage = new HomePage(driver);
		homePage.getLogoutLink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
