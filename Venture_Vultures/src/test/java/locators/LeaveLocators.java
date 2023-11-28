package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveLocators {
	@FindBy(xpath="(//li[@class='oxd-main-menu-item-wrapper'])[3]")
	public WebElement leavetype;
	@FindBy(xpath="(//nav[@class='oxd-topbar-body-nav']//li)[5]//span")
	public WebElement configure;
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	public WebElement leaveformat;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement leaveadd;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement leavename;
	@FindBy(xpath="(//div[@class='oxd-radio-wrapper']//child::span)[1]")
	public WebElement entitlement;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement saveclick;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	public WebElement verifysavemessage;
	@FindBy(xpath="//span[text()='Already exists']")
	public WebElement Alredyexists;
}
