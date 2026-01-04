package RegisterTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registerSingleUser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("name")).sendKeys("Yogeshwar Murugesan");
		driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='email']"))
				.sendKeys("yogeshwarmurugesan4@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("@Yogesh123");

		WebElement days = driver.findElement(By.id("days"));
		Select selectDays = new Select(days);
		selectDays.selectByContainsVisibleText("19");

		WebElement months = driver.findElement(By.id("months"));
		Select selectMoth = new Select(months);
		selectMoth.selectByContainsVisibleText("November");

		WebElement year = driver.findElement(By.id("years"));
		Select selectYear = new Select(year);
		selectYear.selectByContainsVisibleText("2001");

		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();

		driver.findElement(By.id("first_name")).sendKeys("Yogeshwar");
		driver.findElement(By.id("last_name")).sendKeys("Murugesan");
		driver.findElement(By.id("address1")).sendKeys("23/65");
		driver.findElement(By.id("address2")).sendKeys("main road");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("city")).sendKeys("madurai");
		driver.findElement(By.id("zipcode")).sendKeys("625002");
		driver.findElement(By.id("mobile_number")).sendKeys("9094109595");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
}
