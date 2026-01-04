package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	public WebElement nameTextField1;

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	public WebElement emailTextField;

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	public WebElement signupButton;

	@FindBy(id = "id_gender1")
	public WebElement mr_Button;

	@FindBy(id = "id_gender2")
	public WebElement mrs_Button;

	@FindBy(id = "password")
	public WebElement passwordTextField;

	@FindBy(id = "name")
	public WebElement nameTextField2;

	@FindBy(id = "email_address")
	public WebElement emailTextField2;

	@FindBy(id = "days")
	public WebElement daysDropDown;

	@FindBy(id = "months")
	public WebElement monthsDropDown;

	@FindBy(id = "years")
	public WebElement yearsDropDown;

	@FindBy(id = "newsletter")
	public WebElement checkBox1;

	@FindBy(id = "optin")
	public WebElement checkBox2;

	@FindBy(id = "first_name")
	public WebElement first_nameTextField;

	@FindBy(id = "last_name")
	public WebElement last_nameTextField;

	@FindBy(id = "address1")
	public WebElement address1TextField;

	@FindBy(id = "address2")
	public WebElement address2TextField;

	@FindBy(id = "country")
	public WebElement countryDropDown;

	@FindBy(id = "state")
	public WebElement stateTextField;

	@FindBy(id = "city")
	public WebElement cityTextField;

	@FindBy(id = "zipcode")
	public WebElement zipcodeTextField;

	@FindBy(id = "mobile_number")
	public WebElement mobile_numberTextField;

	@FindBy(xpath = "//button[text()='Create Account']")
	public WebElement createAccountButton;

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	public WebElement countinueButton;

	public WebElement getNameTextField1() {
		return nameTextField1;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	public WebElement getMr_Button() {
		return mr_Button;
	}

	public WebElement getMrs_Button() {
		return mrs_Button;
	}

	public WebElement getNameTextField2() {
		return nameTextField2;
	}

	public WebElement getEmailTextField2() {
		return emailTextField2;
	}

	public WebElement getDaysDropDown() {
		return daysDropDown;
	}

	public WebElement getMonthsDropDown() {
		return monthsDropDown;
	}

	public WebElement getYearsDropDown() {
		return yearsDropDown;
	}

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	public WebElement getFirst_nameTextField() {
		return first_nameTextField;
	}

	public WebElement getLast_nameTextField() {
		return last_nameTextField;
	}

	public WebElement getAddress1TextField() {
		return address1TextField;
	}

	public WebElement getAddress2TextField() {
		return address2TextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getZipcodeTextField() {
		return zipcodeTextField;
	}

	public WebElement getMobile_numberTextField() {
		return mobile_numberTextField;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getCountinueButton() {
		return countinueButton;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

}
