package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.LoginLocators;
import utility.HelperClass;

public class LoginActions {
	LoginLocators logact;
	public LoginActions() {
		this.logact = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logact);
	}
	public void setEmail(String username) {
		logact.username.sendKeys(username);
	}
	public void setPassword(String password) {
		logact.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		javascriptClick(logact.loginButton);
	}
	public String getVerifyText() {
		return logact.verifyText.getText();
	}
	public String getErrorText() {
		return logact.errorText.getText();
	}
	public void username(String username)
	{
		logact.username.sendKeys(username);
	}
	public void password(String password)
	{
		logact.password.sendKeys(password);
	}
	
	public void loginAccount(String username, String password) {
		setEmail(username);
		setPassword(password);
	}
	public void javascriptClick(WebElement webElement) {
		HelperClass.jse.executeScript("arguments[0].click()", webElement);	
	}
	public void clicklogout() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(logact.userclick));
		logact.userclick.click();
		logact.logout.click();
	}

}
