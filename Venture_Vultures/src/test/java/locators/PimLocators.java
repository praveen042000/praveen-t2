package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PimLocators {
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
    public WebElement pim;
    @FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")
    public WebElement addemployee;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement empfirstname;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement emplastname;
    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    public WebElement enablebutton;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement empusername;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[9]")
    public WebElement emppassword;
    @FindBy(xpath ="//label[text()='Confirm Password']/following::input")
	public WebElement empcpassword;
    @FindBy(xpath ="//button[@type='submit']")
	public WebElement savebutton;
    @FindBy(xpath ="//h6[@class='oxd-text oxd-text--h6 --strong']")
	public WebElement verfiyuser;
    @FindBy(xpath ="//span[text()='Username already exists']")
	public WebElement AlreadyExists;

}
