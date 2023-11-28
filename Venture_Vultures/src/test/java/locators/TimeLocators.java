package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeLocators {
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[4]")
	public WebElement timeclick;
	@FindBy(xpath="//span[text()='Project Info ']")
	public WebElement projectinfoclick;
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
	public WebElement customer;
	@FindBy(xpath="//button[text()=' Add ']")
	public WebElement selectadd;
	@FindBy(xpath="//label[text()='Name']/following::input")
	public WebElement customername;
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	public WebElement description;
	@FindBy(xpath="//button[text()=' Save ']")
	public WebElement savebutton;
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell'][3]")
	public WebElement verifyemployee;
    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement verifyerror;  
    @FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//child::li[@class='oxd-topbar-body-nav-tab --parent --visited']//following-sibling::li[@class='oxd-topbar-body-nav-tab --parent'][1]")
	public WebElement Job;
	@FindBy(xpath = "//a[text()='Employment Status']")
	public WebElement EmploymentStatus;
}