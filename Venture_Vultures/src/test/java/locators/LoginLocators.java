package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//div[@class='oxd-form-actions orangehrm-login-action']//button[1]")
	public WebElement loginButton;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement verifyText;
	
	@FindBy(xpath="//i[contains(@class,'oxd-icon bi-exclamation-circle')]//following-sibling::p[1]")
	public WebElement errorText;
	@FindBy(xpath="//li[@class='oxd-userdropdown']//span[1]")
	public WebElement userclick;
	@FindBy(xpath="(//a[@class='oxd-userdropdown-link'])[4]")
	public WebElement logout;

}
