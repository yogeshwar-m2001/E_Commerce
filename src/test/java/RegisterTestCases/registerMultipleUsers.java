package RegisterTestCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.RegisterBase;
import ObjectRepository.HomePage;
import ObjectRepository.RegisterPage;

public class registerMultipleUsers extends RegisterBase {
	@DataProvider(parallel = false)
	public String[][] data_provider_data() throws Exception {
		FileInputStream fis = new FileInputStream(
				"/home/yogesh/Desktop/Automation_excercise/E_commerce/src/main/resources/AutomationExercise.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("User Data");

		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rows - 1][cells];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		return data;
	}

	@Test(dataProvider = "data_provider_data")

	public void registerUsers(String Title, String Name, String Email, String Password, String Dob,
			String ADDRESS_First_Name, String ADDRESS_Last_Name, String Address, String Country, String State,
			String City, String Zipcode, String Mobile_Number) throws Exception {

		HomePage homePage = new HomePage(driver);
		homePage.getsignup_LoginLink().click();

		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.getNameTextField1().sendKeys(Name);
		registerPage.getEmailTextField().sendKeys(Email);
		registerPage.getSignupButton().click();

		if (Title.equals("Mr")) {
			registerPage.getMr_Button().click();
		} else {
			registerPage.getMrs_Button().click();
		}

		registerPage.getPasswordTextField().sendKeys(Password);
//		registerPage.getEmailTextField2().sendKeys("");

		String[] split = Dob.split("/");

		if (split[0].startsWith("0")) {
			split[0] = split[0].substring(1);
		}

		if (split[1].startsWith("0")) {
			split[1] = split[1].substring(1);
		}

		Select daySelect = new Select(registerPage.getDaysDropDown());
		Select monthsSelect = new Select(registerPage.getMonthsDropDown());
		Select yearSelect = new Select(registerPage.getYearsDropDown());

		daySelect.selectByValue(split[0]);
		monthsSelect.selectByValue(split[1]);
		yearSelect.selectByVisibleText(split[2]);

		registerPage.getCheckBox1().click();
		registerPage.getCheckBox2().click();
		registerPage.getFirst_nameTextField().sendKeys(ADDRESS_First_Name);
		registerPage.getLast_nameTextField().sendKeys(ADDRESS_Last_Name);
		registerPage.getAddress1TextField().sendKeys(Address);
		registerPage.getAddress2TextField().sendKeys("");

		Select countrySelect = new Select(registerPage.getCountryDropDown());
		countrySelect.selectByVisibleText("India");

		registerPage.getStateTextField().sendKeys(State);
		registerPage.getCityTextField().sendKeys(City);
		registerPage.getZipcodeTextField().sendKeys(Zipcode);
		registerPage.getMobile_numberTextField().sendKeys(Mobile_Number);
		registerPage.getCreateAccountButton().click();

		registerPage.getCountinueButton().click();

		homePage.getLogoutLink().click();

	}
}
