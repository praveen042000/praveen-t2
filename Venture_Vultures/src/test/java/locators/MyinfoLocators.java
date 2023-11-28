package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyinfoLocators {
	@FindBy(xpath="//a[.='My Info']")
	public WebElement myinfo;
	@FindBy(xpath="(//label[text()=  'Employee Full Name']/following::input)[1]")
	public WebElement myfirstname;
	@FindBy(xpath="(//label[text()='Employee Full Name']/following::input)[3]")
	public WebElement mylastname;
//	@FindBy(xpath="(//label[text()='Nickname']/following::input)[1]")
//	public WebElement nickName;
	@FindBy(xpath=" (//label[text()='Employee Id']/following::input)[1]")
	public WebElement employeeid;
	@FindBy(xpath="(//label[text()='Other Id']/following::input)[1]")
	public WebElement otherid;
	@FindBy(xpath="(//label[text()='Employee Full Name']/following::input)[7]")
	public WebElement licencenumber;
	@FindBy(xpath="(//label[text()='License Expiry Date']/following::input)[1]")
	public WebElement Expirydate;
//	@FindBy(xpath="(//label[text()='SSN Number']/following::input)[1]")
//	public WebElement ssnnumber;
//	@FindBy(xpath="(//label[text()='SIN Number']/following::input)[1]")
//	public WebElement sinnuber;
	@FindBy(xpath="//p[text()=' * Required']/following-sibling::button")
	public WebElement infosave;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active']//div)[1]")
	public WebElement nationality;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	public WebElement maritalstatus;
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']//h6[1]")
	public WebElement savedsucessfully;
	@FindBy(xpath=" (//label[text()='Date of Birth']/following::input)[1]")
	public WebElement dateOfBirth;
//	@FindBy(xpath="(//label[text()='Military Service']/following::input)[1]")
//	public WebElement miltaryservice;
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	public WebElement myinfoverify;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	public WebElement bloodgroup;
	@FindBy(xpath="(//div[@class='oxd-form-actions']//button)[2]")
	public WebElement bloodgroupsave;
	@FindBy(xpath="//h6[text()='Attachments']/following-sibling::button")
	public WebElement addfile;
	@FindBy(xpath="(//div[@class='oxd-file-div oxd-file-div--active']//div)")
	public WebElement browser;
	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	public WebElement comment;
	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[3]")
	public WebElement filebrowsersave;


}
