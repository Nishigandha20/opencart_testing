package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class TC001_AccountRegistrationTest extends BaseTestClass {

	
	@Test
	public void verify_registration() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();

		RegistrationPage rp = new RegistrationPage(driver);
		rp.setFirstName(randomeString().toUpperCase());
		rp.setlastName(randomeString().toUpperCase());
		rp.setEmail(randomeString() + "@gmail.com");
		rp.setPhoneNum(randomeNumber());

		String password = randomAlphaNumeric();
		rp.setPassword(password);
		rp.setConfirmPass(password);

		rp.setPrivacy();
		rp.clickContinue();

		String conMsg = rp.getConfirmationMsg();

		Assert.assertEquals(conMsg, "Your Account Has Been Created!");
	}

	
}
