package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLocators {
	
    // Locator for the input field to set the username
	@FindBy(xpath="//div[@class='oxd-table-filter-area']//child::div[@class='oxd-form-row']//child::div[@class='oxd-input-group__label-wrapper'][1]//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
	public WebElement UmUsername;
	
    // Locator for the "Save" button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement UmSaveButton;
	
    // Locator for the "Enable" status element
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell'][5]//child::div")
	public WebElement UmEnable;


}
