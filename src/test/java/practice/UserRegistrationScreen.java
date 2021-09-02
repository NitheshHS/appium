package practice;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserRegistrationScreen {
	public UserRegistrationScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="emailErrorMsg")
	private MobileElement emailErrorMsg;

	@AndroidFindBy(id="email")
	private MobileElement emailTextField;

	@AndroidFindBy(id="FirstName")
	private MobileElement FirstNameMsg;


	@AndroidFindBy(id="Postal")
	private MobileElement PostalMsg;

	@AndroidFindBy(id="address")
	private MobileElement addressErrorMsg;

	@AndroidFindBy(id="continue")
	private MobileElement continueButton;


	public void fillUserInfo(String firstName, String email) {
		
		//Step1; fill all information
		emailTextField.sendKeys(email);

		continueButton.click();
		
		
		if(emailErrorMsg.isDisplayed()) {//true
			//fail test script
			Assert.assertTrue(emailErrorMsg.isDisplayed(), "email is incorrect"+ emailErrorMsg.getText());
		}
		else if(FirstNameMsg.isDisplayed()) {//empty field
			Assert.assertTrue(FirstNameMsg.isDisplayed(),"first name field is empty");
		}
		else if(PostalMsg.isDisplayed()) {
			Assert.assertTrue(PostalMsg.isDisplayed(), "postal pin ");
		}
		
		//return new HomePage(driver);
	}

	@Test
	public void verifyUserReg() {
		
		AppiumDriver<MobileElement> driver=null;
		UserRegistrationScreen user = new UserRegistrationScreen(driver);
		//user.fillUserInfo(jsonUtility.get("firstName"), jsonUtility.get("email"));
	}

}
