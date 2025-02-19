package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//input[@id=\"input-firstname\"]")
	WebElement txtfirstname;
	
	@FindBy (xpath = "//input[@id=\"input-lastname\"]")
	WebElement txtlastname;
	
	@FindBy (xpath = "//input[@id=\"input-email\"]")
	WebElement txtemail;
	
	@FindBy (xpath = "//input[@id=\"input-telephone\"]")
	WebElement txttelephone;
	
	@FindBy (xpath = "//input[@id=\"input-password\"]")
	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@id=\"input-confirm\"]")
	WebElement txtconfirmpassword;
	
	@FindBy (xpath = "//label[normalize-space()='Yes']")
	WebElement clickBtnYes;
	
	@FindBy (xpath = "//label[normalize-space()='No']")
	WebElement clickBtnNo;
	
	@FindBy (xpath = "//input[@name='agree']")
	WebElement clickCheckBox;
	
	@FindBy (xpath = "//input[@value='Continue']")
	WebElement clickBtnContinue;
	
	@FindBy (xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname) {
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastName(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void setPhoneNum(String phone) {
		txttelephone.sendKeys(phone);
	}
	
	public void setPassword(String password) {
		txtpassword.sendKeys(password);
	}
	
	public void setConfirmPass(String confirmpass) {
		txtconfirmpassword.sendKeys(confirmpass);
	}
	
	public void setPrivacy() {
		clickCheckBox.click();
	}
	
	public void clickContinue() {
		clickBtnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	
	
	
	
}
